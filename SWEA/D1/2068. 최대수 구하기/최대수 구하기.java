import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int max = 0;
		
		for(int i = 1; i <= T; i++) {
			max = 0;
			for(int j = 0; j < 10; j++) {
				int temp = sc.nextInt();
				if(temp > max) {
					max = temp;
				}
			}
			System.out.printf("#%d %d\n", i, max);
		}
		sc.close();
	}
}