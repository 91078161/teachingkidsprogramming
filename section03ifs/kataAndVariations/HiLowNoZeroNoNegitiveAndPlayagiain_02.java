package org.teachingkidsprogramming.section03ifs.kataAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
// -------------------Kata Questions------------
// How would you make sure the guess is not zero
// and end game if guess is zero
//How would you make sure the guess is not a negative number
//  but go to the next turn

//write steps in English
// Then translate steps into code
//Make sure to run after each step
public class HiLowNoZeroNoNegitiveAndPlayagiain_02
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      //  If guess is less than 1 end the game---#1
      if (guess < 1)
      {
        // Tell user "Bad input" ----#3
        MessageBox.showMessage("Bad input");
        // Exit the game----#4
        System.exit(0);
        //---------------repeat # 1.2
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}
//