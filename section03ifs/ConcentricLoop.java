package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(150);
    Tortoise.setY(200);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 360; i++)
    {
      Tortoise.move(3);
      Tortoise.turn(1);
      Tortoise.setPenWidth(width);
      if (i % 20 == 0)
        for (int b = 0; b < 360; b++)
        {
          Tortoise.move(1);
          Tortoise.turn(1);
          //              Change the width of the line that the tortoise draws to 1/100th of the current line --#9
          int l = 8;
          Tortoise.setPenWidth(l / 100);
        }
    }
  }
}