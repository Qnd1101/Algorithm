import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        sc.nextLine();
        for(int i = 0; i < n; i++) {
        	String[] str = sc.nextLine().split(" ");
        	
        	x[i] = Integer.parseInt(str[0]);
        	y[i] = Integer.parseInt(str[1]);
        }
        
        for(int i = 0; i < n; i++) {
        	int count = 1;
        	for(int j = 0; j < n; j++) {
        		if(x[i] < x[j] && y[i] < y[j]) {
        			count += 1;
        		}
        	}
        	
        	System.out.print(count + " ");
        }
        
        sc.close();
    }
}
