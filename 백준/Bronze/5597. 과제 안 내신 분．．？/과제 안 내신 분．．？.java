import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[30];
		int[] arr2 = new int[28];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;				// 학생 30명
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();     // 과제 제출자 28명
		}
		
		for(int i = 0; i < 30; i++) {
			for(int j = 0; j < 28; j++) {
				if(arr1[i] == arr2[j]) {
					arr1[i] = 0;   // 과제 제출을 한 학생은 데이터 값을 0으로 바꿈
				}
			}
		}
		
		for(int i = 0; i < 30; i++) {
			if(arr1[i] != 0) {	// 배열 안에 데이터 값이 0이 아닐경우에 출력하는 것이다.
				System.out.println(arr1[i]);
			}
		}
	}		
}