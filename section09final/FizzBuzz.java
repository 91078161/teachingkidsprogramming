package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    for (int i = 1; i < 101; i++)
    {
      if (i % 3 == 0 || i % 5 == 0)
      {
        if (i % 5 == 0 && i % 3 == 0)
        {
          System.out.println("fizzbuzz");
        }
        else
        {
          if (i % 3 == 0)
          {
            System.out.println("fizz");
          }
          if (i % 5 == 0)
          {
            System.out.println("buzz");
          }
        }
      }
      else
      {
        System.out.println(i);
      }
    }
  }
}
