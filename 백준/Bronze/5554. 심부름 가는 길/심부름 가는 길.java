import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		  int a,b,c,d,count,M,be;

	        a =sc.nextInt(); // 집에서 학교까지의 이동 시간을 나타내는 초를 입력하는 곳.
	        b =sc.nextInt(); // 학교에서 PC방까지의 이동 시간을 나타내는 초를 입력하는 곳.
	        c =sc.nextInt(); // PC방에서 학원까지의 이동 시간을 나타내는 초를 입력하는 곳.
	        d =sc.nextInt(); // 학원에서 집까지의 이동 시간을 나타내는 초를 입력하는 곳.

	        count = a+b+c+d; // 

	         M = count / 60; // 
	         be = count % 60;

	        System.out.print(M+"\n"+be);
	}
}