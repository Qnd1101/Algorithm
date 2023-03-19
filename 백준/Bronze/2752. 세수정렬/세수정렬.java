import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

	int A,B,C;
	
	A = sc.nextInt(); // ''
	B = sc.nextInt(); // ''
	C = sc.nextInt(); // A B C 를 입력하는 곳
	
	if (A<B && A<C && B<C) { // 오름차순 이라서 A, B, C 순으로 출력하기 위해선 A는 B와 C보다 작아야 처음에 나오고 B는 C보다 커야한다.  
		System.out.printf("%d %d %d",A,B,C);
	}else if(A<B && A<C && B>C ) { // 여기도 위에랑 마찬가지인데 B랑 C 순서만 바꾸어 준것.
		System.out.printf("%d %d %d",A,C,B);
	}else if(B<A && B<C && A<C) { // 여기는 뭐.. 위에 보고 이해 하세여
		System.out.printf("%d %d %d",B,A,C);
	}else if(B<A && B<C && A>C) {
		System.out.printf("%d %d %d",B,C,A);
	}else if(C<A && C<B && A<B) {
		System.out.printf("%d %d %d",C,A,B);
    }else if(C<A && C<B && A>B) {
		System.out.printf("%d %d %d",C,B,A);
    	}
	}
}