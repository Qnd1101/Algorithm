using System;

public class ing
{
    public static void Main()
    {
        int H, M;
        string[] ming = Console.ReadLine().Split(" ");
      
        H = int.Parse(ming[0]);
        M = int.Parse(ming[1]);

        if (H == 0 && M < 45)
        {
            Console.WriteLine("23" + " " + (60 - (45 - M)));
        } else if (H == 0 && M > 45)
        {
            Console.WriteLine(H+" "+ (M-45));
        } else if ( H == H && M < 45)
        {
            Console.WriteLine((H-1)+" "+ (60 - (45 - M)));
        }
        else
        {
            Console.WriteLine(H+" "+(M-45));
        }   
    }
}