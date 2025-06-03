/**
 * The main class that starts the simulation.
 * For the milestone version, it creates a grid, adds some sample organisms,
 * and prints the grid in text format to the console.
 */

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.set(2, 3, new Rabbit());
        grid.set(5, 5, new Wolf());
        grid.set(1, 1, new Grass());

        // Print initial grid
        for (int r = 0; r < grid.rows; r++) {
            for (int c = 0; c < grid.cols; c++) {
                Organism o = grid.get(r, c);
                if (o instanceof Rabbit) System.out.print("R ");
                else if (o instanceof Wolf) System.out.print("W ");
                else if (o instanceof Grass) System.out.print("G ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
