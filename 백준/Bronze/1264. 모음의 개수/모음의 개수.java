import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	while(true) {
		String str=sc.nextLine();
		if(str.equals("#")) {
			break;
		}
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A') {
				count ++;
			}else if(str.charAt(i)=='e' || str.charAt(i)=='E') {
				count ++;
			}else if(str.charAt(i)=='i' || str.charAt(i)=='I') {
				count ++;
			}else if(str.charAt(i)=='o' || str.charAt(i)=='O') {
				count ++;
			}else if(str.charAt(i)=='u' || str.charAt(i)=='U') {
				count ++;
			}
			
			}
		System.out.println(count);
		}
		
	}

}