import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int te = sc.nextInt();
		int[] n = new int[te];
		int m = sc.nextInt();
		
		for(int i = 0; i < n.length; i++) {
			n[i] = i + 1;
		}
		
		for(int i = 0; i < m; i++) {
			int lLine = sc.nextInt();
			int rLine = sc.nextInt();
			
			int temp = 0;
			for(int j = rLine - 1; j > lLine - 1; j--) {	
				for(int k = lLine - 1; k < j; k++) {
					temp = n[k];
					n[k] = n[k+1];
					n[k+1] = temp;
				}
			}
		}
		
		for(int i : n){
			System.out.print(i + " ");
		}
	}
}
