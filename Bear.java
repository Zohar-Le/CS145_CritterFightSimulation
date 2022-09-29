import java.awt.*;
import java.util.*;
/**
 * A critter class called Bear which extends the Critter class
 * and performs its own behavior
 * @author Zohar Le
 * @version 10-3-2021
 */


public class Bear extends Critter {
   private boolean polar;
   private int move = 0 ;
   private Random rand = new Random();
   /** Default constructor that will set the color of the bear
    */
   public Bear (){
      int randBear = rand.nextInt(2);        // random bearType
      if (randBear == 0){                    // random 0 is Polar Bear  
         polar = true;
      }
      else {
         polar = false;
      }    
   }
   @Override
   public Color getColor() {
      if (polar){
         return Color.WHITE;
      } else {
         return Color.BLACK;
      }   
   }
   @Override
   public String toString() {
      if (move%2 == 0){
         return "/";
      } else {
         return "\\";
      }
   }
   @Override
   public Action getMove(CritterInfo info) {
      move++;                                               // increase move to change the Slash
      if (info.getFront() == Neighbor.OTHER){               // if the neighbor is an enemy then infect
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.EMPTY){          // if the neighbor is empty then hop into it
         return Action.HOP;
      }
      else {                                                // else turn left, parent have their getMove method turn left
         return super.getMove(info);
      }
   }
}