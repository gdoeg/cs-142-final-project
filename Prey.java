/**
 * Represents a prey animal like a Rabbit that eats plants.
 * Prey can gain energy by eating and potentially reproduce.
 */
public abstract class Prey extends Animal {

    public void eat(Plant plant) {
        if (plant.isEdible()) {
            energy += 2;
        }
    }

    // Has to have "enough" energy to reproduce 
    // loses half of its energy reproducing 
    // spawns new offspring at r,c location
    public void reproduce(Grid grid, int r, int c) {
        if (energy >= 8) {
            energy /= 2;
            grid.set(r, c, createOffspring());
        }
    }

    // Each prey type must define how to create its offspring
    protected abstract Prey createOffspring();
}
