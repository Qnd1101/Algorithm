import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" "); 
			if(set.contains(str[0]) || set.contains(str[1])) {
				set.add(str[0]);
				set.add(str[1]);
			}
		}
		System.out.println(set.size());
	}
	
}