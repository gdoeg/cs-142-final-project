/**
 * A simple graphical window that displays the grid visually.
 * Each organism is shown in a colored square based on its type.
 * For the milestone version, it only shows the initial grid state.
 */

import java.awt.*;
import javax.swing.*;

public class Gui extends JPanel {
    private final Grid grid;

    public Gui(Grid grid) {
        this.grid = grid;
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cellSize = 40;

        for (int r = 0; r < grid.rows; r++) {
            for (int c = 0; c < grid.cols; c++) {
                Organism o = grid.get(r, c);
                if (o != null) {
                    g.setColor(o.getColor());
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(c * cellSize, r * cellSize, cellSize, cellSize);
                g.setColor(Color.BLACK);
                g.drawRect(c * cellSize, r * cellSize, cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.set(2, 3, new Rabbit());
        grid.set(5, 5, new Wolf());
        grid.set(1, 1, new Grass());

        JFrame frame = new JFrame("Predator-Prey Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Gui(grid)); // ✅ Use new Gui instead of YourProgramGUI
        frame.pack();
        frame.setVisible(true);
    }
}
