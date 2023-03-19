import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		int[] ing = new int[num];
		
		for (int i = 0; i < ing.length; i++) {
			ing[i] = sc.nextInt();
		}
		Arrays.sort(ing);
		
		for(int j = 0; j < ing.length; j++) {
			System.out.println(ing[j]);
		}
	}
}