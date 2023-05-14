import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 바구니의 개수
        int n = sc.nextInt();
        // 바구니 안의 값을 바꿀 횟수
        int m = sc.nextInt();
        // 바구니 개수만큼 배열 크기 선언
        int[] arr = new int[n];
        
        // 배열 안에 값을 순차적으로 넣음
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        
        // 공을 교환하는 for문
        for(int i = 0; i < m; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
			// 자리를 바꾸기 위해 temp라는 변수를 선언
		    int temp = 0;
            // 배열은 0번째가 첫번째 라서 I - 1, J - 1
            temp = arr[I - 1]; // I번째 자리를 temp라는 변수에 저장
            arr[I - 1] = arr[J - 1]; // I번째 자리에 J번째 자리에 있는 값을 저장
            arr[J - 1] = temp; // J번째 자리에 아까 I번째 자리를 저장해두었던 temp를 이터럴 값에 넣음.
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        sc.close();
    }
}