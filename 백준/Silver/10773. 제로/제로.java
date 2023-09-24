import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int sum = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < K; i++){
            int n = sc.nextInt();
            if(n == 0){
                sum -= stack.peek();
                stack.pop();
            }else{
                stack.push(n);
            }
            // 합계
            sum += n;
        }

        System.out.println(sum);
        sc.close();
    }
}

