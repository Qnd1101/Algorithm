import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램

        int N= sc.nextInt(); // 줄서있는 사람
        int[] P = new int[N]; // 줄서있는 사람들이 인출하는데 걸리는 시간을 저장
        int temp = 0; //
        int sum = 0; //

        for(int i = 0; i < N; i++){
            P[i] = sc.nextInt(); // 줄서있는 사람들이 인출하는데 각각 몇분씩 필요한가 입력하는 곳
        }

        Arrays.sort(P); // 3 1 4 3 2
                        // 1 2 3 3 4

        for (int i = 0; i < N; i++){
            sum += temp + P[i];
            // 0 + 1 = 1 == 1  // i = 0  [0]
            // 1 + 2 = 3 == 4  // i = 1
            // 3 + 3 = 6 == 10 // i = 2
            // 6 + 3 = 9 == 19 // i = 3
            //                 // i = 4
            temp += P[i];
            // P[0] = 1 == 1   // i = 0  [1]
            // P[1] = 2 == 3   // i = 1
            // P[2] = 3 == 6   // i = 2
            // P[3] = 3 == 9   // i = 3
            // P[4] = 4 == 13  // i = 4
        }
        System.out.println(sum);
    }
}