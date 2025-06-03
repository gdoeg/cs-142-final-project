/**
 * A specific type of plant that grows in the grid.
 * Rabbits can eat grass, and it regrows after being eaten.
 * This class tracks whether the grass is fully grown or still regrowing.
 */

import java.awt.Color;

public class Grass extends Plant {
    private boolean fullyGrown = true;

    public void regrow() {
        fullyGrown = true;
    }

    public boolean isFullyGrown() {
        return fullyGrown;
    }

    @Override
    public boolean isEdible() {
        return fullyGrown;
    }

    @Override
    public void act(Grid grid) {
        // Grass regrows logic here if needed
    }

    @Override
    public Color getColor() {
        return fullyGrown ? Color.GREEN : Color.LIGHT_GRAY;
    }
}
