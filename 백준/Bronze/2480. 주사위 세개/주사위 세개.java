import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] A = new int[3]; // 1에서부터 6까지의 눈을 가진 3개의 주사위.

        int max = 0; // 상금을 저장하는 변수.
        int max1 = 0; // 가장 많은 상금을 받은 사람의 상금을 보관하는 변수.


            A[0] = sc.nextInt(); // 1번째.
            A[1] = sc.nextInt(); // 2번째.
            A[2] = sc.nextInt(); // 3번째.

            if (A[0] == A[1] && A[1] == A[2]) { // A and B and C
                max = 10000 + A[0] * 1000;
            } else if (A[0] == A[1] || A[0] == A[2] ) { // A and B
                max = 1000 + A[0] * 100;
            }else if (A[1] == A[2]) { // B and C
                max = 1000 + A[1] * 100;
            } else {
                if (A[0] > A[1]) { //가장 큰 수 찾기
                    if (A[0] > A[2]) {
                        max1 = A[0];
                    } else {
                        max1 = A[2];
                    }
                } else {
                    if (A[1] > A[2]) {
                        max1 = A[1];
                    } else {
                        max1 = A[2];
                    }
                }
                max = max1 * 100;
                        //sum = max
            }
            if (max > max1){ // 가장 많은 상금을 받은 사람의 값을 출력하기 위한 조건.
                max1 = max;
            }

        System.out.println(max1);
    }
}