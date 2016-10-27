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

//--------Kata Question ------
//Where do you see duplicate lines of code
//and how do you refacter to make this code more readable
//Write out the steps in english
//Then translate the steps into code
//Make sure to run after each line

import org.teachingextensions.virtualproctor.VirtualProctor;

public class PyramidsOfGizaRemoveEvenMoreDuplication_03
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Ruben & Brandon");
    setUpPyramidLand();
    turnAndMove(-90, 220);
    turnAndMove(135, 100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    turnAndMove(135, 210);
  }
  private static void turnAndMove(int degrees, int length)
  {
    Tortoise.turn(degrees);
    Tortoise.move(length);
  }
  private static void moveUp()
  {
    // Look for duplicate lines of code
    // refactor code that moves tordus up
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
