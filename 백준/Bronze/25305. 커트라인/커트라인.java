import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		int th = sc.nextInt();
		
		Integer[] kt = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			kt[i] = sc.nextInt();
		}
			Arrays.sort(kt, Collections.reverseOrder());
			System.out.println(kt[th-1]);
	
	}
}