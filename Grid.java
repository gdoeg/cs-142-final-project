// This class represents the simulation world as a grid of cells.
// It stores organisms, allows access/modification, and updates the simulation with each step.

import java.util.*;

public class Grid {
    public int rows, cols;
    private Organism[][] grid;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Organism[rows][cols];
    }

    public void initialize() {
        set(2, 3, new Rabbit());
        set(5, 5, new Wolf());
        set(1, 1, new Grass());
    }

    public void step() {
        // Copy to avoid concurrent modification
        List<Organism> organisms = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                Organism o = grid[r][c];
                if (o != null && o.isAlive()) organisms.add(o);
            }
        }
        for (Organism o : organisms) {
            o.act(this);
        }
    }

    public Organism get(int r, int c) {
        return grid[r][c];
    }

    public void set(int r, int c, Organism o) {
        grid[r][c] = o;
    }
}
