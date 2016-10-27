package org.teachingkidsprogramming.section02methods.kata_and_variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

// ---------kata Question---------------
// How would you make a house with a slanted roof?
// write out steps in English
// The translate the steps in to code
// Make sure to run after each line
public class HousesToSlantedRoof_02
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Brandon and Ruben");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHousePointyRoof(height);
    drawHousePointyRoof(120);
    drawHousePointyRoof(90);
    drawHousePointyRoof(20);
  }
  public static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  public static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    // make a slanted roof
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(135);
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    // Make a pointy roof
    // Turn the tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
    // Make the tortoise move A--#2
    Tortoise.move(30);
    // Turn the Tortoise 90 degrees right--#3
    Tortoise.turn(90);
    // Move the Tortoise A --#4
    Tortoise.move(30);
    //Turn the tortoise 45 degrees to the right--#5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
