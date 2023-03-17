import java.util.Scanner;
import java.util.Arrays ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //투자비
        int B = sc.nextInt(); //생산비
        int C = sc.nextInt(); //판매가
        int sum = C-B; // 판매가 - 생산비
        int sonick = 0;

        if (C < B || B == C) {
            System.out.println("-1");
        } else {
            sonick = A / sum;
            System.out.println(sonick + 1);
        }
    }
}