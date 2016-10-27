package org.teachingkidsprogramming.section03ifs.kataAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_Variation01
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    int numguess = MessageBox.askForNumericalInput("How many guesses do you want");;
    for (int i = 0; i < 7; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your number between 1 and 100");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You have won the game");
        System.exit(0);
      }
      if (answer - guess < numguess && answer - guess > -numguess)
      {
        MessageBox.showMessage("You're close");
        if (guess > answer)
        {
          MessageBox.showMessage("Too high");
        }
        else
        {
          MessageBox.showMessage("Too low");
        }
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
    MessageBox.showMessage("You Lost. The number was " + answer);
  }
}
