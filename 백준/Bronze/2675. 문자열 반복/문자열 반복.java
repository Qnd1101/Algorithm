import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
        	int t = sc.nextInt();
        	String str = sc.next();
        	
        	for(int j = 0; j < str.length(); j++) {
        		for(int k = 0; k < t; k++) {
        			System.out.print(str.charAt(j));
        		}
        	}
        	System.out.println();
        }
       
    }
    
}