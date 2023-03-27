import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] 버섯 = new int[10]; // 버섯 10개
        int 점수 = 0; // 버섯의 점수
        int max = 0; // 최대값

        for (int i = 0; i < 10; i++){ // 10번 반복
            점수 += 버섯[i] = sc.nextInt(); // 점수 += 버섯의 점수 입력
            if (100-max >= Math.abs(100-점수)){
                // Math.abs()란 절대값을 반환.  -100 > 100 음수를 양수로
                max = 점수; //
            }
        }
        System.out.println(max);
    }
}