import java.awt.*;
/**
 * A critter class called Gator which extends the Critter class
 * and performs its own behavior
 * @author Zohar Le
 * @version 10-3-2021
 */


public class Gator extends Critter {
   private int move = 0;
   /** Default constructor
    */
   public Gator(){}
   
   public Action getMove(CritterInfo info) {                                        // after testing Gator is so strong and infect all other critters maybe 
      move++;                                                                       // i made it to OP.
      
      if (info.getFront() == Neighbor.OTHER){                                       // always infect if the neighbor in the front 
         return Action.INFECT;
      } else if (info.getLeft() == Neighbor.OTHER){
         return Action.LEFT;                                                        // Gator will face the enemy and maybe luckily can infect them before being infected
      } else if (info.getRight() == Neighbor.OTHER){
         return Action.RIGHT;                                                       // Gator will face the enemy and maybe luckiky can infect them before being infected
      } else if (info.getFront() == Neighbor.EMPTY){                                // for moving
         return Action.HOP;
      } else {
         return Action.LEFT;                                                        // turn left when hit the wall or face ally
      }
   }

   public Color getColor() {                                      // Hopefully some good color effect
       if (move%2 == 0){
         return Color.GREEN;
      } else {
         return Color.GRAY;                                           
      }
   }

   public String toString() {                                     // chomping chomping
      if (move%2 == 0){
         return ">+-";                                            // does it look like a gator?
      } else {
         return "=+-";
      }
   }
}