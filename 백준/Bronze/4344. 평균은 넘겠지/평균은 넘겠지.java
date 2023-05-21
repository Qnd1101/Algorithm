import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스
        int sum = 0; // 합계를 구하는 변수
        float count = 0; // 평균을 넘는 학생의 수를 파악하기 위한 변수
        float avg = 0; // 평균을 저장

        for(int i = 0; i < t; i++){
            int n = sc.nextInt(); // 학생의 수
            int[] num = new int[n]; // 학생의 수 만큼 배열 크기 선언
            for(int j = 0; j < n; j++){
                num[j] = sc.nextInt(); // 점수를 입력받음
                sum += num[j]; // 입력받은 점수를 sum에 더함
            }
	
            avg = sum / n; // 평균을 구함

            for(int j = 0; j < n; j++){
                if(num[j] > avg){
								// 평균을 넘는 학생들만 count를 증가
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", count / n * 100);
						// count / n * 100 값을 출력

            sum = 0; // 초기 세팅으로 바꿈
            avg = 0; // 초기 세팅으로 바꿈
            count = 0; // 초기 세팅으로 바꿈
        }
    }
}