import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}		
		
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				count += 1;
				break;
			}else {
				count +=1;
				continue;
			}
		}

		System.out.println(max);
		System.out.println(count);
	}
}