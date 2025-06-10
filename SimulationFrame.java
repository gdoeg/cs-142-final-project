import javax.swing.*;
import java.awt.*;

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