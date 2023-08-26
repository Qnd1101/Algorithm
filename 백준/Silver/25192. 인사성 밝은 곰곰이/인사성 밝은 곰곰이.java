import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap<>();
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				map = new HashMap<>();
				continue;
			}else if (map.containsKey(str)) {
				continue;
			}
			map.put(str, str);
			result++;
		}
		
		System.out.println(result);
	 
	}
	
}