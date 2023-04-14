import java.util.Scanner;
import java.util.Stack;
// 입력메소드, 처리메소드, 출력메소드


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자 수열의 크기와 수열 숫자를 입력받는다
		
		int n = sc.nextInt(); // 수열의 크기
		boolean result = true;
		
		Stack<Integer> stack = new Stack<>(); 
		// 제네릭 형식의 데이터형을 받아들여 스택 인스턴스 객체 선언
		
		StringBuffer bf = new StringBuffer();
		// 메소드 반환 등의 저장공간을 생성하는 메소드
		
		int numberSta = 1; // 스택 수(스택에 저장된 맨 마지막 수를 의미)
		for(int i = 0; i < n; i++) {
			int numberSeq = sc.nextInt();
			
			while(numberSeq >= numberSta) { // 수열 수가 스택수보다 크거나 같은 경우 push를 반복 진행
				stack.push(numberSta++); // push() 메소드는 Stack 라이브러리에서 제공
				bf.append("+\n"); // append() 데이터를 저장시켜놓는 메소드
								// push() 마다 '+'와 줄바꿈을 저장
			} // while
			int p  = stack.pop();	// while 문을 벗어난 상태는 스택수와 수열수가 같은 상태
			bf.append("-\n"); // pop()이 일어나므로 '-'와 줄바꿈을 저장
			if(p > numberSeq) { // 스택에 들어있던 수가 수열수보다 큼
				result = false;
				break;
			} // if
		} // for
		
		if (result) { // result가 true일 경우 Stringbuffer내용을 출력하고, 아니면 NO를 출력
			System.out.print(bf.toString());
		}else {
			System.out.println("NO");
		}
		
	}
}
