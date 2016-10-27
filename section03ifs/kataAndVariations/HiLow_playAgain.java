package org.teachingkidsprogramming.section03ifs.kataAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_playAgain
{
  public static void main(String[] args)
  {
    // we need a while loop because we dont know how many time the user wants to play
    // This is called arbitrary data
    // need a varible to play aging
    int playAgain = 1;
    while (playAgain == 1)
    {
      int answer = NumberUtils.getRandomInt(1, 100);
      MessageBox.showMessage("The number is " + answer);
      // int numguess = MessageBox.askForNumericalInput("How many guesses do you want");
      int tries = 0;
      for (; tries < 2; tries++)
      {
        int guess = MessageBox.askForNumericalInput("What is your number between 1 and 100");
        if (guess == answer)
        {
          Sound.playBeep();
          MessageBox.showMessage("You have won the game");
          //          System.exit(0);
          break;
        }
        if (guess > 100 || guess <= 0)
        {
          MessageBox.showMessage("Bad input. Put a number between 1-100");
          System.exit(0);
        }
        int range = 10;
        if (answer - guess < range && answer - guess > -range)
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
      if (tries == 2)
        MessageBox.showMessage("You Lost. The number was " + answer);
      playAgain = MessageBox.askForNumericalInput("Enter '1' to play again");
    }
  }
}
