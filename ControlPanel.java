import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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