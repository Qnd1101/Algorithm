import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine(); // 문자를 입력받는다.
		String ing="a b c d e f g h i j k l m n o p q r s t u v w x y z"; // 소문자 알파벳.
		
		String[] ddong=ing.split(" ");
		
		for(int i=0; i<26; i++) {
			System.out.print(str.indexOf(ddong[i])+" ");
			
		}
		
	}

}
