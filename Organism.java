/**
 * The base class for anything that can live in the grid (plants or animals).
 * All organisms must be able to act each turn and return their color for the GUI.
 * This class is abstract, meaning it is not used directly but inherited by other classes.
 */

import java.awt.Color;

public abstract class Organism {
    public abstract void act(Grid grid);
    public abstract Color getColor();
}
