import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Rabbit extends Prey {

    @Override
    public void act(Grid grid) {
        int r = rand.nextInt(grid.rows);
        int c = rand.nextInt(grid.cols);

        if (grid.get(r, c) instanceof Grass grass) {
            eat(grass);
            grid.set(r, c, null); // Eat the grass
        }

        move(grid);
        reproduce(grid, r, c);
        loseEnergy();
    }

    @Override
    public void move(Grid grid) {
        int currentR = -1, currentC = -1;

        // Find current location and sets currentR and currentC to current 
        // row and column
        for (int r = 0; r < grid.rows; r++) {
            for (int c = 0; c < grid.cols; c++) {
                if (grid.get(r, c) == this) {
                    currentR = r;
                    currentC = c;
                    break;
                }
            }
        }

        if (currentR == -1 || currentC == -1) return;

        // Try moving in a random direction
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        // Converts direction to List so it can be shuffled
        List<int[]> shuffled = Arrays.asList(dirs);
        Collections.shuffle(shuffled);

        // Loops through shuffled direction 
        // Calculates new row and column newR and newC 
        // based on direction
        for (int[] dir : shuffled) {
            int newR = currentR + dir[0];
            int newC = currentC + dir[1];

            // checks if new position is within grid bounds 
            // and is currently empty
            if (newR >= 0 && newR < grid.rows && newC >= 0 && newC < grid.cols && grid.get(newR, newC) == null) {
                grid.set(newR, newC, this);
                grid.set(currentR, currentC, null);
                break;
            }
        }
    }

    @Override
    protected Prey createOffspring() {
        return new Rabbit();
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
