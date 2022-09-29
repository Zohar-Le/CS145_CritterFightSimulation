import java.awt.*;
import java.util.*;
/**
 * A critter class called Giant which extends the Critter class
 * and performs its own behavior
 * @author Zohar Le
 * @version 10-3-2021
 */
public class Giant extends Critter {
   private int move = 0;
   private int name = 0;
   private String[] giantName = {"fee", "fie", "foe", "fum"}; 
   /** Default constructor
    */
   public Giant (){}
   @Override
   public Color getColor() {
      return Color.GRAY;
   }
   @Override
   public String toString() {
      if (move == 6){                              // if we get 6 moves then reset move back to 0
         move = 0;
         if (name ==3 ){                              // if we get all 4 names being changed then reset it back to the first name
            name = 0;
         } else{
            name++;                                   // else change the name
         } 
         return giantName[name];
      } else { 
      return giantName[name];                      // return the specific name if it is not the 6th move that we have to make to change    

      }              
   }
   @Override
   public Action getMove(CritterInfo info) {
      move++;                                               // increase move to make change if needed
      if (info.getFront() == Neighbor.OTHER){               // if the neighbor is an enemy then infect
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.EMPTY){          // if the neighbor in the front is empty then hop into it
         return Action.HOP;
      }
      else {                                                // else turn right
         return Action.RIGHT;
      }
   }
}