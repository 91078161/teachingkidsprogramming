package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 7; i++)
    {
      int guess = MessageBox.askForNumericalInput("what is your guess in numbers");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You have won the game");
        System.exit(0);
      }
      if (answer - guess < 10 || answer - guess > -10)
      {
        MessageBox.showMessage("You're close");
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
