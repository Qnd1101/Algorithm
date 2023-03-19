import java.util.Scanner;
import java.util.Arrays ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 기준
        String str = sc.next(); // 같은 숫자를 찾기 위한 입력
        int sum = 0;

        for(int i = 1; i <= n; i++){
            String[] num = String.valueOf(i).split(""); // "" 을 기준으로 칸을 나누고 정수형에서 문자형으로 변경
            for(int j = 0; j < num.length; j++){
                if (num[j].equals(str)){ // num[j] 자리랑 str이랑 비교해서 같을경우 +1을 해줌.
                    sum += 1;
                }
            }
        }
        System.out.println(sum); // 출력
    }
}