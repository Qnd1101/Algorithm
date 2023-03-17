import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {			// n단 피라미드 출력
			for(int j = 0; j < n-i-1; j++) {	// 공백 출력 for문 
				System.out.print(" ");			// 공백 출력
			}	
			for(int j = 0; j < i*2+1; j++) {	// 1, 3, 5, 7, 9... 2씩 늘어나는 for문
				System.out.print("*");			// 별 출력
			}
			System.out.println();				// 줄바꿈 
		}
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (n-i)*2-3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
