package org.teachingkidsprogramming.section05recursion.katas_and_variation;

public class TowersOfHunio
{
  public static int index;
  public static void main(String[] args)
  {
    // creat some constan varibles (final means they can't be changed after intinazlation)
    final int NUM_DISCS = 5; // number of discs to move
    final int FROM_PEG = 1; // intaial 'from' peg
    final int TO_PEG = 3;
    final int TEMP_PEG = 2;
    // play game
    moveDiscs(NUM_DISCS, FROM_PEG, TO_PEG, TEMP_PEG);
    System.out.println("\nAll the discs are moved!");
  }
  private static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg)
  {
    if (num > 0)
    {
      moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
      index++;
      System.out.println(index + ". Move a disc from peg " + fromPeg + " to peg " + toPeg);
      moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
    }
  }
}
