/**
 * A wolf is a type of predator that hunts rabbits.
 * It moves toward rabbits, eats them to survive, and reproduces if it has enough energy.
 * If it doesn't eat, it eventually dies from starvation.
 */

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

public class Wolf extends Predator {

    @Override
    public void act(Grid grid) {
        int r = rand.nextInt(grid.rows);
        int c = rand.nextInt(grid.cols);

        if (grid.get(r, c) instanceof Rabbit) {
            eat((Rabbit) grid.get(r, c));
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

        // exits sim if location not found on grid
        if (currentR == -1 || currentC == -1) return;

        // defines directions and shuffles them / randomizes the order
        // so organism doesn't try moving in the same direction first
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        Collections.shuffle(Arrays.asList(dirs));

        // For each shuffled direction:
        // - new coordinates calculated
        // - checks if new spot is within boundaries or empty 
        // if so moves organism to that cell, clears old position
        // breaks the loop 
        for (int[] dir : dirs) {
            int newR = currentR + dir[0];
            int newC = currentC + dir[1];

            if (newR >= 0 && newR < grid.rows && newC >= 0 && newC < grid.cols && grid.get(newR, newC) == null) {
                grid.set(newR, newC, this);
                grid.set(currentR, currentC, null);
                break;
            }
        }
    }


    @Override
    protected Predator createOffspring() {
        return new Wolf();
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }
}
