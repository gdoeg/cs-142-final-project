/**
 * A rabbit is a type of prey that moves randomly around the grid.
 * It eats grass, gains energy, and reproduces when it has enough energy.
 * If it runs out of energy, it dies.
 */

import java.awt.Color;

public class Rabbit extends Animal {
    @Override
    public void act(Grid grid) {
        move(grid);
        loseEnergy();
    }

    @Override
    public void move(Grid grid) {
        // Random move logic here
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
