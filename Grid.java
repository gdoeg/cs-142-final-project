/**
 * Represents the 2D world where the simulation takes place.
 * Each cell in the grid can hold one organism (or be empty).
 * The grid provides methods to get or set organisms at specific positions.
 */

public class Grid {
    private Organism[][] grid;
    public final int rows, cols;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Organism[rows][cols];
    }

    public Organism get(int r, int c) {
        return grid[r][c];
    }

    public void set(int r, int c, Organism o) {
        grid[r][c] = o;
    }

    public Organism[][] getGrid() {
        return grid;
    }
}
