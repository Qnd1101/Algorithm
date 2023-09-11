import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputNum = br.readLine().split(" ");
		
		int n = Integer.parseInt(inputNum[0]);
		int m = Integer.parseInt(inputNum[1]);
		
		String[] str = br.readLine().split(" ");
		
		int[] arr = new int[n];
		for(int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		
		int ij = 0;
		int ijk = 0;
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			ij = 0;
			for(int j = i+1; j < arr.length; j++) {
				ij = arr[i] + arr[j];
				for(int k = j+1; k < arr.length; k++) {
					ijk = ij + arr[k];
					if(m >= ijk && ijk > max) {
						max = ijk;
					}
				}
			}
		}
		
		System.out.println(max);
	}
	
}
