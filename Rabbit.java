// Represents a rabbit in the simulation.
// Rabbits randomly move to an empty spot on the grid.
import java.awt.*;
import java.util.Random;

public class Rabbit extends Organism {
    private Random rand = new Random();

    @Override
    public void act(Grid grid) {
        // Move randomly
        int row = rand.nextInt(grid.rows);
        int col = rand.nextInt(grid.cols);
        if (grid.get(row, col) == null) {
            grid.set(row, col, this);
        }
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}