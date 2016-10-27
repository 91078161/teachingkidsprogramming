package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // Use the tortoise to draw a red square with a width and a height of 40 px
  // Write each of the english line comments  use at least 6 comments
  // Number each comment line, at the end, so your user knows the correct line of code
  // Verify -  step one - translate each comment line into java
  // Verify - step two - Run you code after each line
  public static void main(String[] args)
  {
    //TODO: write comments and then code here
    //Show the tortoise--#1
    Tortoise.show();
    //Move tortoise as fast as possible --#6
    Tortoise.setSpeed(10);
    //Do the following four times --#5.1
    for (int i = 0; i < 4; i++)
    {
      //  Set pen color to red -- #4
      Tortoise.setPenColor(PenColors.Reds.Red);
      //  Move the tortoise 40px -- #2
      Tortoise.move(40);
      //  Turn tortoise to the right 90 degrees right -- #3
      Tortoise.turn(90);
      //repeat --#5.2
    }
  }
}
