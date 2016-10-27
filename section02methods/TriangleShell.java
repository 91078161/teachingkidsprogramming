package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static void drawTriangle()
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
      Tortoise.setPenWidth(0.5);
    }
  }
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 60; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      //      Increase the current length of the side by 4 pixels --#8
      length = length + 4;
      drawTriangle();
      //
      //      Turn the tortoise 1/60th of 360 degrees to the right --#10
      Tortoise.turn(360 / 60);
      // Repeat --#7.2
    }
    VirtualProctor.setName("Brandon and Ruben");
    VirtualProctor.setClassName("Palm Digital");
  }
}
