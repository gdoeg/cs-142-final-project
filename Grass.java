/**
 * A specific type of plant that grows in the grid.
 * Rabbits can eat grass, and it regrows after being eaten.
 * This class tracks whether the grass is fully grown or still regrowing.
 */

 import java.awt.*;

 public class Grass extends Plant {
     @Override
     public void act(Grid grid) {
         // Optional: implement regrow logic later
     }
 
     @Override
     public Color getColor() {
         return Color.GREEN;
     }
 
     @Override
     public boolean isEdible() {
         return true;  // Rabbits can eat grass
     }
 }
 