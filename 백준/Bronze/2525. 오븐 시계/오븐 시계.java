import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int plus = sc.nextInt();
		
		int temp = (h * 60) + m + plus; // 시간, 분, 요리하는 데 필요한 시간을 초로 만든다.
		int H = (temp / 60) % 24;  
		// 시간 나누기 60을 한 후에 24를 한 이유는 나머지를 이용하여 시간이 24일 경우에 0으로 처리하기 위함이다.
		int M = temp % 60;
		// temp를 60으로 나눈 나머지를 변수 M에 저장한 코드입니다.
		
		System.out.printf("%d %d",H,M);
	}
}