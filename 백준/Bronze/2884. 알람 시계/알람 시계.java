import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45) {
			h -= 1;
		}
		
		if (h < 0) {
			h = 23;
		}
		
		if (m < 45) 
		{
			m = 60 - (45 - m);
			System.out.printf("%d %d", h, m);
		} 
		else 
		{
			m = m - 45;
			System.out.printf("%d %d", h, m);
		}
	}
}