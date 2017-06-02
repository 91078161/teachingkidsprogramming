package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    //    Uncomment the line below -- #1.2
    programWindow.setWindowVisible(true);
    //    Have SimpleBubble listen for when the left mouse button is clicked in your program window --#2.2
    programWindow.addMouseLeftClickListener(this);
    //    prepareColorPalette (recipe below) --#7.1
    //
    //    ------------- Recipe for prepareColorPalette --#7.2
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    //         Add blue to the color wheel --#5
    ColorWheel.addColor(PenColors.Blues.Blue);
    //         Add dark blue to the color wheel --#6
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    //     ------------- Recipe for createBubble --#8.2
    //     Remove previous bubbles from your program window --#9
    programWindow.clearWindow();
    int radius = NumberUtils.getRandomInt(10, 60);
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setCenter(x, y);
    programWindow.add(circle);
    //    ------------- End of createBubble recipe --#8.3
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}