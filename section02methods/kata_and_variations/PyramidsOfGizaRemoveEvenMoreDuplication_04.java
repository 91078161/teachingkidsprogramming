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

//--------Kata Question ------
//Where do you see duplicate lines of code
//and how do you refacter to make this code more readable
//Write out the steps in english
//Then translate the steps into code
//Make sure to run after each line

// be aware; this an example of too much refactoring, i.e after 
// we are done

import org.teachingextensions.virtualproctor.VirtualProctor;

public class PyramidsOfGizaRemoveEvenMoreDuplication_04
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Ruben & Brandon");
    setUpPyramidLand();
    //bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210}};
    
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
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
