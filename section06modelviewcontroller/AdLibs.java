package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdverb();
    //MessageBox.showMessage("Thew edVerb is " + edVerb);
    String bodyPart = askBodyPart();
    // MessageBox.showMessage("The body part is" + bodyPart);
    String currentStory = "Today I woke " + adverb + ". Then I" + edVerb + " my " + bodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the body part");
    if (bodyPart.isEmpty())
    {
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*")) // that is a regular expression
    {
      MessageBox.showMessage("No body, no story, pay attention and start over!");
      bodyPart = askBodyPart();
    }
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("what is the Adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter a adverb");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("numbers <> adverb ! Try again!");
    }
    return adverb;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("what is the -ed verb");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb in ed");
    }
    return edVerb;
  }
}