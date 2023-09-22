import java.util.Scanner;
import java.util.Arrays ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++){
            int ota = sc.nextInt(); // 지울 문자열
            ota -= 1; // 배열은 0부터니깐 -1을 해줌
            String[] str = sc.next().split(""); // 문자열을 입력받고 "" < 기준으로 0 1 2 3 
            str[ota] = "";
            for (int j = 0; j < str.length; j++) {
                System.out.print(str[j]);
            }
            System.out.println();
        }
    }
}