import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

// push X: 정수 X를 스택에 넣는 연산이다.
// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 스택에 들어있는 정수의 개수를 출력한다.
// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
public class Main {
	
    public static void main(String[] args)	throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        Stack<Integer> stack = new Stack<>(); // 스택 기능 활용을 위해 스택 선언
        
        for(int i = 0; i < t; i++) {
        	String str = br.readLine();
        	String[] sp = str.split(" ");
        	
        	if (sp[0].equals("push")) {
        		stack.push(Integer.parseInt(sp[1])); // sp배열에 저장되어있는 타입은 문자열이기 때문에 정수형으로 변환
        	} 
        	else if(sp[0].equals("pop")) {
        		if(stack.empty()) { // 스택이 비어있다면
        			System.out.println("-1");
        		}else { // 비어있지 않다면.
        			System.out.println(stack.pop());
        		}
        	} 
        	else if(sp[0].equals("size")) {
        		System.out.println(stack.size());
        	} 
        	else if(sp[0].equals("empty")) {
        		if(stack.empty()) {
        			System.out.println("1");
        		}else {
        			System.out.println("0");
        		}
        	} 
        	else {
        		if(stack.empty()) {
        			System.out.println("-1");
        		}else {
        			System.out.println(stack.peek());
        		}
        	}
        }
    }
}
