import java.awt.*;
/**
 * A critter class called Titan which extends the Giant class
 * and performs its own behavior
 * @author Zohar Le
 * @version 10-3-2021
 */

public class Titan extends Giant {
   /** Default constructor
    */
   public Titan (){}  
   @Override
   public Color getColor() {
      if (super.toString().equals("fee")){
         return Color.BLACK;
      } else if (super.toString().equals("fie") || super.toString().equals("fum")   ) {
         return Color.GRAY;
      } else {
         return Color.WHITE;
      }
   }
   @Override
   public Action getMove(CritterInfo info) { 
      if (info.getFront() != Neighbor.OTHER && info.getFront() != Neighbor.EMPTY){  // if the neighbor is not enemy or empty then turn left
         return Action.LEFT;
      }                                                                             // else do the same thing as the parent
      else {                                                                        
         return super.getMove(info);
      }
   }
}