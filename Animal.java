/**
 * The base class for all animals in the grid (rabbits, wolves, etc.).
 * Animals can move, lose energy, and die if their energy reaches zero.
 * Each animal must define how it acts during a turn.
 */

import java.util.Random;

public abstract class Animal extends Organism {
    protected int energy = 5;
    protected boolean alive = true;
    protected Random rand = new Random();

    public abstract void move(Grid grid);

    public void loseEnergy() {
        energy--;
        if (energy <= 0) alive = false;
    }

    public boolean isAlive() {
        return alive;
    }
}
