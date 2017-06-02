package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 1000);
    for (int i = 0; i < 20; i++)
    {
      int guess = MessageBox.askForNumericalInput("what is your guess in numbers");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You have won the game");
        System.exit(0);
      }
      if (answer - guess < 25 && answer - guess > -25)
      {
        if (guess > answer)
        {
          MessageBox.showMessage("You're close and Too high");
          Sound.playBeep();
        }
        if (guess < answer)
        {
          MessageBox.showMessage("You're close and Too low");
          Sound.playBeep();
        }
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
        Sound.playBeep();
      }
      else
      {
        MessageBox.showMessage("Too low");
        Sound.playBeep();
      }
    }
    MessageBox.showMessage("You Lost. The number was " + answer);
  }
}
