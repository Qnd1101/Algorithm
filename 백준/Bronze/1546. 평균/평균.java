import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 세준이가 집에 가져온 시험지 개수 
		double[] arr = new double[n]; // 세준이의 시험 점수들 저장 하는 배열
		double max = 0;	// 세준이의 점수 중 최댓값
		double avg = 0;// 평균
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // 세준이의 시험 점수를 입력 받음
			if(arr[i] > max) { // 세준이의 시험 점수중 최댓값을 저장
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			avg += (arr[i] / max * 100) / n; 
		}
		
		System.out.println(avg);
		sc.close();
	}
	
}