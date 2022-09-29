import java.awt.*;
import java.util.*;
/**
 * A critter class called Lion which extends the Critter class
 * and performs its own behavior
 * @author Zohar Le
 * @version 10-3-2021
 */

public class Lion extends Critter {
   private Random rand = new Random();
   private Color[] randColor = {Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE};
   private int move = 0;
   private Color color;
   private int randNumColor = rand.nextInt(4);
   /** Default constructor choose a random color for the lion
    */
   public Lion (){
      color = randColor[randNumColor];
   }
   @Override
   public Color getColor()  {       
      if(move > 3) {                                  // change color after 3 move
         int randNewNum = rand.nextInt(4);               // compare if they are the same color
         if (randNewNum != randNumColor){                // if not then store new color to color
            randNumColor = randNewNum;
         } else {                                        // if same color then run the method again
            getColor();
         }
         move = 0;                                    // SUCCESSFULLY change color then restart count 
         return color = randColor[randNumColor];      // return the new color  
      } else {
      return color ;                                  // if color doesnt need to be change then return the current color
      }
   }

   @Override
   public String toString() {
      return "L";
   }
   @Override
   public Action getMove(CritterInfo info) {
      move++;
      if (info.getFront() == Neighbor.OTHER){                                                   // if the neighbor in the front is an enemy then infect
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){           // if the neighbor infront or to right is wall then turn left
         return Action.LEFT;
      }
      else if (info.getFront() == Neighbor.SAME) {                                              // if the neighbor in the front is fellow then turn right
         return Action.RIGHT;
      }
      else {                                                                                    // else hop
         return Action.HOP;      
      }
   }
}
