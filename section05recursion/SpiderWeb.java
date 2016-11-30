package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    Tortoise.setAnimal(Animals.Spider);
    //    Change the pen color of the line the tortoise draws to red --#13.1
    Tortoise.setPenColor(PenColors.Reds.Red);
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    //    The current zoom is 1.1 --#8.2
    float length = 10.5f;
    float zoom = 1.1f;
    //    Do the following 10 times --#10.1
    for (int i = 0; i < 10; i++)
    {
    }
    //        weaveOneLayer (recipe below) --#9.1
    //
    //        ------------- Recipe for weaveOneLayer --#9.2
    for (int i = 0; i < 6; i++)
    {
      //
      drawTriangle();
      //
      Tortoise.turn(360 / 6);
      //            Increase the current length (of the line) by the current zoom --#8.1
    }
    //        ------------- End of weaveOneLayer recipe --#9.3
    //
    //        Change the current zoom so it is multiplied by 1.3 --#11
    //    Repeat --#10.2
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 3; i++)
    {
      double length = 10.5;
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
