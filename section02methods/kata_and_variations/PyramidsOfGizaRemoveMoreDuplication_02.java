package org.teachingkidsprogramming.section02methods.kata_and_variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//--------Kata Question ------
// Where do you see duplicate lines of code
// and how do you refacter to make this code more readable
// Write out the steps in english
// Then translate the steps into code
// Make sure to run after each line

//--------Kata Question ------
//Where do you see duplicate lines of code
//and how do you refacter to make this code more readable
//Write out the steps in english
//Then translate the steps into code
//Make sure to run after each line

// Look for duplicate lines of code
// refactor code that moves tordus up

import org.teachingextensions.virtualproctor.VirtualProctor;

public class PyramidsOfGizaRemoveMoreDuplication_02
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Ruben & Brandon");
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void moveUp()
  {
    Tortoise.turn(-90); // !!!
    Tortoise.move(100); // !!!
  }
  private static void moveDown()
  {
    // Move the tortoise down
    // Extract a method and name it move down
    Tortoise.turn(90); //!!!
    Tortoise.move(100);//!!!
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
