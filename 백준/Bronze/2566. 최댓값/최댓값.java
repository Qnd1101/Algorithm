import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int max = 0;
		int maxLocationX = 0;
		int maxLocationY = 0;
		
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > max) {
					max = arr[i][j];
					maxLocationX = i;
					maxLocationY = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((maxLocationX+1)+" "+(maxLocationY+1));
	}
}