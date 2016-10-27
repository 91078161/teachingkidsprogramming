package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Spiral
{
  public static void main(String[] args)
  {
    ColorWheel.addColor(PenColors.Purples.BlueViolet);
    ColorWheel.addColor(PenColors.Purples.Violet);
    ColorWheel.addColor(PenColors.Purples.Purple);
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 75; i++)
    {
      try
      {
        Tortoise.setPenWidth(30);
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(i * 5);
        Tortoise.turn(360 / 3);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
    }
    VirtualProctor.setName("Ruben and Brandon");
    VirtualProctor.setClassName("Palm Digital");
  }
}
