import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    	
		int num,A,B;
		num = 1000000;
		
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			
			if (A == 0 && B == 0) {
				break;
			}
			
			if(A>B) {
				System.out.println("Yes");
			}else
				System.out.println("No");
		}	
    }
}