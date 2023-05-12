import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // K개 입력을 하기 위해서 K변수 선언
        int K = sc.nextInt();
        int sum = 0;

        // 스택을 이용하여 값을 넣고, 뺴고, 찾기 위해 선언
        Stack<Integer> stack = new Stack<>();
        
        // K번 만큼 반복
        for(int i = 0; i < K; i++){
            int n = sc.nextInt();
            // n이 0일경우 push되어있는 값들 중 가장 위에있는 값을 찾고 합계에서 뺀 후, pop을 발생시킴.
            if(n == 0){
                sum -= stack.peek();
                stack.pop();
            }
            // n이 0이 아닐경우 push를 해줌
            else{
                stack.push(n);
            }
            // 합계
            sum += n;
        }
        
        System.out.println(sum);
        sc.close();
    }
}

