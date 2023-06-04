import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            stack.push(Integer.parseInt(br.readLine()));
        }
        
        int count = 1; // 막대기가 보이는 횟수
        int maxNum = stack.pop(); // 처음 값을 저장하지만, 결국에는 최대값을 저장하는 변수

        while(!stack.empty()){ // 스택이 비어있지 않을 경우에 반복을 함
            int temp = stack.pop();
            if(temp > maxNum){ // firstNumber값이 pop으로 꺼내왔을 때 값보다 작을 경우에 count를 +1 해줌.
                maxNum = temp;
                count++;
            }
        }

        System.out.println(count);
    }
}
