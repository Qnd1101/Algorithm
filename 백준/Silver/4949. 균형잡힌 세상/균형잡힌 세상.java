import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String inputStr = br.readLine();

            if(inputStr.equals(".")) break;

            MinStack stack = new MinStack(); // 스택 구현.
            String[] strArr = inputStr.split("");

            for(String str : strArr){
                if(str.equals("(")){
                    stack.push("(");
                }else if(str.equals("[")){
                    stack.push("[");
                }else if(str.equals(")")){
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(")");
                    }
                }else if(str.equals("]")){
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    }else {
                        stack.push("]");
                    }
                }
            }

            if(stack.isEmpty()){ // 스택이 비어있을 경우 : yes
                System.out.println("yes");
            } else { // 스택에 값이 들어있는 경우 : no
                System.out.println("no");
            }
        }
    }
}

class MinStack {
    private int top;
    private ArrayList<String> stack;

    public MinStack() {
        this.top = -1;
        this.stack = new ArrayList<String>();
    }

    // 스택에 값을 추가하는 메서드
    public void push(String value) {
        top++;
        stack.add(value);
    }

    // 스택에서 값을 제거하는 메서드
    public void pop() {
        if (!isEmpty()) {
            stack.remove(top);
            top--;
        }
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top == -1;
    }

    // 스택의 맨 위의 값을 확인하는 메서드
    public String peek() {
        if (!isEmpty()) {
            return stack.get(top);
        }
        return "";
    }
}
