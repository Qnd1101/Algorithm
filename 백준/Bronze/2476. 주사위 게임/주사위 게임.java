import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt(); // 경우의 수.
        int[] A = new int[3]; // 

        int max = 0;
        int max1 = 0;

        for (int i = 0; i < count; i++) {
            A[0] = sc.nextInt();
            A[1] = sc.nextInt();
            A[2] = sc.nextInt();

            if (A[0] == A[1] && A[1] == A[2]) {
                max = 10000 + A[0] * 1000;
            } else if (A[0] == A[1]) {
                max = 1000 + A[0] * 100;
            } else if (A[0] == A[2]) {
                max = 1000 + A[0] * 100;
            } else if (A[1] == A[2]) {
                max = 1000 + A[1] * 100;
            } else {
                Arrays.sort(A);
                max = A[2] * 100;
            }

            if (max > max1){
                max1 = max;
            }
        }
        System.out.println(max1);
    }
}
