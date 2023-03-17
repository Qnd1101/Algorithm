import java.util.Scanner;
import java.util.Arrays ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, k = 0, Chickensum = 0, Chickencoupon = 0;

        while (sc.hasNextInt()) {
            n = sc.nextInt(); // 주문할 치킨 수
            k = sc.nextInt(); // 치킨으로 교환하는 쿠폰의 갯수
            Chickencoupon = n; // 치킨쿠폰 갯수
            Chickensum = n; // 치킨 총합

            // n = 7 , k = 2
            while (true) {
                if (Chickencoupon / k > 0) { // 치킨쿠폰에서 치킨으로 교환하는 쿠폰의 갯수로 나눌수 있을때까지
                    // 7 true ①
                    // 4 true ⑤
                    // 2 true ⑨
                    // 1 false ⑬
                    Chickensum += Chickencoupon / k; // 치킨쿠폰에서 치킨으로 교환하는 쿠폰의 갯수로 나눈걸 치킨 총합에 넣음
                    // (원래 n개 있었음) 10  // 7 / 2 == 3 ②
                    // 12                  // 4 / 2 == 2 ⑥
                    // 13                  // 2 / 2 == 1 ⑩
                    Chickencoupon = Chickencoupon / k + Chickencoupon % k; // 사칙연산에 의해 나누기, 나머지가 먼저 연산된 후에 더하기
                                    // 7 / 2 + 7 % 2 ③
                    // 3 + 1 = 4 ④
                                    // 4 / 2 + 4 % 2 ⑦
                    // 2 + 0 = 2 ⑧
                                    // 2 / 2 + 2 % 2 ⑪
                    // 1 + 0 = 1 ⑫
                } else { // 치킨쿠폰에서 치킨으로 교환하는 쿠폰의 갯수로 나누지 못한다면 브레이크를 해서 while문을 빠져나감.
                    break;
                }
            }
            System.out.println(Chickensum); // 치킨 총합
        }
    }
}