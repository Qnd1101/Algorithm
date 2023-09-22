import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < 8; i++) {
			int n = Integer.parseInt(str[i]);
			
			if(n - i == 1) {
				a++;
			}else if (n - (8 - i) == 0) {
				b++;
			}
		}
		if(a == 8) {
			System.out.println("ascending");
		}else if(b == 8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
	}
	
}
