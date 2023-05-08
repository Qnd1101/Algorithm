import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 바구니의 갯수
        int n = sc.nextInt();
        // 바구니 안의 값을 바꿀 횟수
        int m = sc.nextInt();
        // 바구니 갯수만큼 배열 크기 선언
        int[] N = new int[n];

        // 자리를 바꾸기 위해 temp라는 변수를 선언
        int temp = 0;
        
        // 배열 안에 값을 순차적으로 넣음
        for(int i = 0; i < N.length; i++){
            N[i] = i + 1;
        }
        
        // 공을 교환하는 for문
        for(int i = 0; i < m; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();

            // 배열은 0번째가 첫번째 라서 I - 1, J - 1
            temp = N[I - 1];
            N[I - 1] = N[J - 1];
            N[J - 1] = temp;
        }
        
        
        for(int i = 0; i < N.length; i++){
            System.out.printf("%d ", N[i]);
        }
        sc.close();
    }
}
