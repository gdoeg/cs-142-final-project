/**
 * A wolf is a type of predator that hunts rabbits.
 * It moves toward rabbits, eats them to survive, and reproduces if it has enough energy.
 * If it doesn't eat, it eventually dies from starvation.
 */

import java.awt.Color;

public class Wolf extends Animal {
    @Override
    public void act(Grid grid) {
        move(grid);
        loseEnergy();
    }

    @Override
    public void move(Grid grid) {
        // Logic to chase rabbits (not fully implemented here)
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }
}
