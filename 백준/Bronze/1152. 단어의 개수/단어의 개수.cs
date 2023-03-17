public class Program
{

	public static void Main()
	{
		string str = Console.ReadLine();
		str = str.Trim();
		int sum = 0;

		for (int i = 0; i < str.Length; i++)
		{
			if (str[i] == ' ')
            {
				sum += 1;
            }
		}

		if(str.Length == 0)
        {
			Console.WriteLine(0);
        }
        else
        {
			Console.WriteLine(sum+1);
        }
	}
}