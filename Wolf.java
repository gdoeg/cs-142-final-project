/**
 * A wolf is a type of predator that hunts rabbits.
 * It moves toward rabbits, eats them to survive, and reproduces if it has enough energy.
 * If it doesn't eat, it eventually dies from starvation.
 */

 import java.awt.*;
 import java.util.Random;
 
 public class Wolf extends Organism {
     private Random rand = new Random();
 
     @Override
     public void act(Grid grid) {
         // Move randomly or toward rabbits
         int row = rand.nextInt(grid.rows);
         int col = rand.nextInt(grid.cols);
         if (grid.get(row, col) == null || grid.get(row, col) instanceof Rabbit) {
             grid.set(row, col, this);
         }
     }
 
     @Override
     public Color getColor() {
         return Color.GRAY;
     }
 }
