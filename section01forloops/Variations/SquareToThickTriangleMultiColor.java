package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//
//--------kata Questions-----------
//
// how would you make an equilateral Triangle with a horizontal base?
//Write the steps in english 
//Then translate the steps into code
//Make sure to run after every line
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickTriangleMultiColor
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Ruben and Brandon");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to multicolor
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
