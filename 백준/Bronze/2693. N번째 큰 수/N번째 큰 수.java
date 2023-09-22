import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력한 만큼 출력 n개
		
		int[] boomboom = new int[10]; // 배열의 크기는 항상 10
		int[] bua = new int[n]; // 3번째 큰값
		
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < 10; j++) { // 배열은 항상 0부터 시작이라서 0 < 10
				boomboom[j] = sc.nextInt(); // 10번 입력.
			}
			Arrays.sort(boomboom); // 3번째 큰값을 하기 위해서 오름차순으로 정렬함
			bua[i] = boomboom[7]; // 0 1 2 3 4 5 6 "7" 8 9
		}
		for (int i = 0; i < n; i++) { // 출력문.
			System.out.println(bua[i]); 
		}
	}

}