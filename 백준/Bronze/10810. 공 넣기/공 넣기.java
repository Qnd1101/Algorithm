import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 도현이의 총 바구니 수(N)
        int n = sc.nextInt();
        // 도현이가 앞으로 M번 공을 넣으려고 한다.
        int M = sc.nextInt();

        // 도현이의 총 바구니 수를 출력하기 위한 배열
        int[] N = new int[n];

        for(int i = 0; i < M; i++){
            // I번 바구니부터,
            int I = sc.nextInt();
            // J번 바구니까지,
            int J = sc.nextInt();
            // K번 번호가 적혀져 있는 공을 넣는다.
            int K = sc.nextInt();
            
            // 배열은 0번째부터이므로 'I - 1'을 해준다.
            for(int j = I - 1; j < J; j++){
                N[j] = K;
            }
        }

        // 출력
        for(int i = 0; i < N.length; i++){
            System.out.printf("%d ", N[i]);
        }

        sc.close();
    }
}
