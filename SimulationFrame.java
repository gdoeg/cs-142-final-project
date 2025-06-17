// This class sets up the main GUI window using a JFrame.
// It contains both the simulation panel (where the animation is shown) and the control panel (with Pause and Reset buttons).

import java.awt.*;
import javax.swing.*;

public class SimulationFrame extends JFrame {
    private SimulationPanel simulationPanel;
    private ControlPanel controlPanel;

    public SimulationFrame() {
        setTitle("Predator-Prey Simulation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        simulationPanel = new SimulationPanel();
        controlPanel = new ControlPanel(simulationPanel);

        add(simulationPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
