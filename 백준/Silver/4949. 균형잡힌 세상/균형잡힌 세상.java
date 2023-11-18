import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;

/*

입력 :
So when I die (the [first] I will see in (heaven) is a score list).
[ first in ] ( first out ).
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

            MinStack<Character> stack = new MinStack<>(10);
            char[] charArray = inputStr.toCharArray();

            for (char ch : charArray) {
                switch (ch) {
                    case '(':
                    case '[':
                        stack.push(ch);
                        break;
                    case ')':
                        if (!stack.isEmpty() && stack.peek() == '(') { // 스택이 비어있고 가장 위에 있는 문자가 "(" 인 경우엔 pop() 메서드를 호출
                            stack.pop();
                        } else {
                            stack.push(ch);
                        }
                        break;
                    case ']':
                        if (!stack.isEmpty() && stack.peek() == '[') { // 스택이 비어있고 가장 위에 있는 문자가 "[" 인 경우엔 pop() 메서드를 호출
                            stack.pop();
                        } else {
                            stack.push(ch);
                        }
                        break;
                }
            }

            if (stack.isEmpty()) { // 스택이 비어있을 경우 : yes
                System.out.println("yes");
            } else { // 스택에 값이 들어있는 경우 : no
                System.out.println("no");
            }

            stack.clear();
        }
    }
}

class MinStack<E> {
    private int size;
    private int index;
    private Object[] stackArray;

    public MinStack(int inputSize) {
        size = inputSize;
        stackArray = new Object[size];
    }

    // 스택에 값을 추가하는 메서드
    public void push(E element) {
        if(index == size) arrayLengthCompare();
        stackArray[index++] = element; // 현재 위치에 요소를 넣는다.
    }

    // 스택에서 값을 제거하고 반환하는 메서드
    public E pop() {
        if (!isEmpty()) {
            return (E) stackArray[--index];
        }
        throw new EmptyStackException();
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return index == 0;
    }

    // 스택의 맨 위의 값을 확인하는 메서드
    public E peek() {
        if (!isEmpty()) {
            return (E) stackArray[index - 1];
        }
        throw new EmptyStackException();
    }

    // 스택의 사이즈를 확인하는 메서드
    public int size() {
        return index;
    }

    // 스택의 초기 상태로 돌아가는 메서드
    public void clear() {
        index = 0;
        stackArray = new Object[size];
    }

    // 스택의 길이를 비교하여 배열의 크기를 늘리는 메서드
    private void arrayLengthCompare() {
            int newStackArrayLength = stackArray.length * 2;
            size = newStackArrayLength;
            stackArray = java.util.Arrays.copyOf(stackArray, newStackArrayLength); // Arrays.copyOf() 메서드는 원본 배열의 요소를 새로운 배열에 복사하는 메서드이다.

    }
}

