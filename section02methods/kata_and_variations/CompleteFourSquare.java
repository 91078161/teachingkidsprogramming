package org.teachingkidsprogramming.section02methods.kata_and_variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//------------FourSquare Kata---------------//

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    // Show the Tortoise ---#1
    Tortoise.show();
    //Set fastest speed--#2
    Tortoise.setSpeed(10);
    // do the folowing 4 times--#8.1
    for (int i = 0; i < 4; i++)
    {
      // use drawSquare method--#9
      drawSquare();
      // Make Tortoise turn 90 degrees right--#10
      Tortoise.turn(90);
      //------repeat----#8.2
    }
  }
  // Make a drawSquare method--#3.1
  private static void drawSquare()
  {
    // Do the following 4 times--#5.1
    for (int i = 0; i < 4; i++)
    {
      // MAke the pen color random--#4
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Move the Tortoise50 pixels--#6
      Tortoise.move(50);
      // Turn the Tortoise 90 degrees to the right--#7
      Tortoise.turn(90);
      //-----------repeat--------#5.2  
    }
    //-----------------repeat------#3.2
  }
}
