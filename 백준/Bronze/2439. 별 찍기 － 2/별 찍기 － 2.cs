using System;

public class ing
{
    public static void Main()
    {
        int jun = int.Parse(Console.ReadLine()); 
   
        for (int i = 1; i <= jun; i++) // 별의 갯수. 
        {
            for (int j = 1; j <= jun-i; j++)
            {
                Console.Write(" ");
            }for(int k = 1; k <= i; k++)
            {
                Console.Write("*");
            }
            Console.WriteLine();
        }
    }
}