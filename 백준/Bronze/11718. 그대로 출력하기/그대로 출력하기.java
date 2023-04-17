import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		String str = "";
		while((str = br.readLine()) !=  null) {
			System.out.println(str);
		}
		
	}
}