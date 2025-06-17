/**
 * A specific type of plant that grows in the grid.
 * Rabbits can eat grass, and it regrows after being eaten.
 * This class tracks whether the grass is fully grown or still regrowing.
 */

 import java.awt.*;

 public class Grass extends Organism {
     @Override
     public void act(Grid grid) {
         // Regrow logic (optional)
     }
 
     @Override
     public Color getColor() {
         return Color.GREEN;
     }
 }
 