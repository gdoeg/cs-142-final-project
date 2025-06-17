/**
 * The main class that starts the simulation.
 * For the milestone version, it creates a grid, adds some sample organisms,
 * and prints the grid in text format to the console.
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimulationFrame());
    }
}
