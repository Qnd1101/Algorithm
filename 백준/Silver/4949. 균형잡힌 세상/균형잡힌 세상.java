import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

입력 :
So when I die (the [first] I will see in (heaven) is a score list).
([ first in ] ( first out ).
Half Moon tonight (At least it is better than no Moon at all].
A rope may form )( a trail in a maze.
Help( I[m being held prisoner in a fortune cookie factory)].
([ (([( [ ] ) ( ) (( ))] )) ]).
 .
.

출력 :
yes
yes
no
no
no
yes
yes

 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String inputStr = br.readLine(); // 문자열 입력

            if (inputStr.equals(".")) break; // '.' 이라는 문자를 만나면? 멈춘다.

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
            for (String str : strArr) {
                switch (str) {
                    case "(":
                    case "[":
                        stack.push(str);
                        break;
                    case ")":
                        if (stack.peek().equals("(")) { // 가장 위에 있는 문자가 "(" 인 경우엔 pop() 메서드를 호출하고?
                            stack.pop();
                        } else { // 아니면 push() 메서드를 호출한다.
                            stack.push(str);
                        }
                        break;
                    case "]":
                        if (stack.peek().equals("[")) { // 가장 위에 있는 문자가 "[" 인 경우엔 pop() 메서드를 호출하고?
                            stack.pop();
                        } else { // 아니면 push() 메서드를 호출한다.
                            stack.push(str);
                        }
                        break;
                }
            }

            if (stack.isEmpty()) { // 스택이 비어있을 경우 : yes
                System.out.println("yes");
            } else { // 스택에 값이 들어있는 경우 : no
                System.out.println("no");
            }
        }
    }
}
class MinStack {
    private int top;
    private String[] stack;

    public MinStack() {
        this.top = -1;
        this.stack = new String[10];
    }

    // 스택에 값을 추가하는 메서드
    public void push(String value) {
        if(top == stack.length - 1) { // 스택이 넘쳤을 경우에
            String[] newStack = new String[stack.length * 2]; // 배열이 가득 찼을 경우 크기를 현재 크기의 2배로 확장한다.
            for(int i = 0; i < top + 1; i++){
                newStack[i] = stack[i];
            }
            stack = newStack; // 새로운 배열로 업데이트(배열의 길이 + 내용 전부 복사)
        }
        stack[++top] = value;

    }

    // 스택에서 값을 제거하고 반환하는 메서드
    public String pop() {
        if (!isEmpty()) {
            return stack[top--]; // 가장 위에 있는 문자 반환 및 top 감소
        }
        return "underflow";
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top == -1;
    }

    // 스택의 맨 위의 값을 확인하는 메서드
    public String peek() {
        if (!isEmpty()) { // 스택이 존재 한다면?
            return stack[top];  // 가장 위에 있는 값을 반환
        }
        return ""; // 존재하지 않을 시에는 공백을 반환
    }
}