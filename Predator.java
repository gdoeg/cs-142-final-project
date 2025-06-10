/**
 * Represents a predator animal like a Wolf that hunts Prey.
 * Predators gain energy by eating prey and can reproduce.
 */
public abstract class Predator extends Animal {

    public void eat(Prey prey) {
        energy += 3;
        prey.alive = false;
    }

    public void reproduce(Grid grid, int r, int c) {
        if (energy >= 10) {
            energy /= 2;
            grid.set(r, c, createOffspring());
        }
    }

    // Each predator must define how to create its offspring
    protected abstract Predator createOffspring();
}
