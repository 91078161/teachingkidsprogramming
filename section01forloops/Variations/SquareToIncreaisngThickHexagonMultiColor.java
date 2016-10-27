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

public class SquareToIncreaisngThickHexagonMultiColor
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Ruben and Brandon");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    int length = 5;
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      length = length * 2;
      Tortoise.move(length);
      Tortoise.turn(360 / sides);
    }
  }
}