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

//            for(String str : strArr){
//                if(str.equals("(")){
//                    stack.push("(");
//                }else if(str.equals("[")){
//                    stack.push("[");
//                }else if(str.equals(")")){
//                    if (stack.peek().equals("(")) {
//                        stack.pop();
//                    } else {
//                        stack.push(")");
//                    }
//                }else if(str.equals("]")){
//                    if (stack.peek().equals("[")) {
//                        stack.pop();
//                    }else {
//                        stack.push("]");
//                    }
//                }
//            }
            for(String str : strArr){
                switch (str){
                    case "(" :
                    case "[" :
                        stack.push(str);
                        break;
                    case ")" :
                        if(stack.peek().equals("(")){ // 가장 위에 있는 문자가 "(" 인 경우엔 pop() 메서드를 호출하고?
                            stack.pop();
                        }else { // 아니면 push() 메서드를 호출한다.
                            stack.push(str);
                        }
                        break;
                    case "]" :
                        if(stack.peek().equals("[")){ // 가장 위에 있는 문자가 "[" 인 경우엔 pop() 메서드를 호출하고?
                            stack.pop();
                        }else { // 아니면 push() 메서드를 호출한다.
                            stack.push(str);
                        }
                        break;
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
            stack.remove(top); // 가장 위에 있는 문자 삭제
            top--;
        }
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top == -1;
    }

    // 스택의 맨 위의 값을 확인하는 메서드
    public String peek() {
        if (!isEmpty()) { // 스택이 존재 한다면?
            return stack.get(top); // 가장 위에 있는 값을 반환
        }
        return ""; // 존재하지 않을 시에는 공백을 반환
    }
}
