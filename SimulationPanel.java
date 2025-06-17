// This class runs and draws the simulation.
// It updates the grid every half-second unless the simulation is paused.
// It also handles pausing and resetting the simulation.

import java.awt.*;
import javax.swing.*;

public class SimulationPanel extends JPanel {
    private Grid grid;
    private Timer timer;
    private boolean paused = false;

    public SimulationPanel() {
        setPreferredSize(new Dimension(500, 500));
        resetSimulation();

        timer = new Timer(500, e -> {
            if (!paused) {
                grid.step();
                repaint();
            }
        });
        timer.start();
    }

    public void resetSimulation() {
        grid = new Grid(10, 10);
        grid.initialize();
        repaint();
    }

    public void togglePause() {
        paused = !paused;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cellSize = getWidth() / grid.cols;
        for (int r = 0; r < grid.rows; r++) {
            for (int c = 0; c < grid.cols; c++) {
                Organism o = grid.get(r, c);
                g.setColor(o != null ? o.getColor() : Color.WHITE);
                g.fillRect(c * cellSize, r * cellSize, cellSize, cellSize);
                g.setColor(Color.BLACK);
                g.drawRect(c * cellSize, r * cellSize, cellSize, cellSize);
            }
        }
    }
}
