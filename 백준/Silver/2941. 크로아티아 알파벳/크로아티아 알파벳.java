import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ctCh = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(int i = 0; i < ctCh.length; i++) {
        	if(str.contains(ctCh[i])) {
        		str = str.replaceAll(ctCh[i], " ");
        	}
        }
        
        System.out.println(str.length());
        sc.close();
    }
 
}
