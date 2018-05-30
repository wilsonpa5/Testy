/*
 * CS 3667 Day 1
 */

public class TaxYax
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < args.length; i++)
        {
            int value = Integer.valueOf(args[i]);
            if (value <= 0)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                System.out.print(value + " ");
            }
            if (value > 0 && value < 50)
            {
                System.out.print("Low");
            }
            else
            {
                if (value > 249)
                {
                    System.out.print("High");
                }
                else
                {
                    System.out.print("Mid");
                }
                if (value % 2 == 1)
                {
                    System.out.print(" true");
                }

            }
            System.out.println();
        }
    }

}
