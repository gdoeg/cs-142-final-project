// This class provides user interface controls (Pause and Reset buttons) for the simulation.
// It sends commands to the SimulationPanel when buttons are clicked.


import javax.swing.*;

public class ControlPanel extends JPanel {
    private JButton pauseButton, resetButton;

    public ControlPanel(SimulationPanel panel) {
        pauseButton = new JButton("Pause");
        resetButton = new JButton("Reset");

        pauseButton.addActionListener(e -> panel.togglePause());
        resetButton.addActionListener(e -> panel.resetSimulation());

        add(pauseButton);
        add(resetButton);
    }
}