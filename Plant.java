/**
 * Represents any type of plant in the grid (like grass).
 * Plants can be edible, meaning animals like rabbits can eat them.
 * This is a general class extended by specific plants like Grass.
 */
public abstract class Plant extends Organism {
    public abstract boolean isEdible();
}
