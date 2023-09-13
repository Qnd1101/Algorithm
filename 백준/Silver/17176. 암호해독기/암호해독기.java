import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] strNum = br.readLine().split(" ");
		String[] equalsStr = new String[n];
		String[] inputStr = br.readLine().split("");

		for (int i = 0; i < equalsStr.length; i++) {
			int Qnd = Integer.parseInt(strNum[i]);
			if (Qnd == 0) {
				equalsStr[i] = " ";
				continue;
			}
			equalsStr[i] = (Qnd <= 26) ? String.valueOf((char) (Qnd + 64)) : String.valueOf((char) (Qnd + 70));
		}

		Arrays.sort(equalsStr);
		Arrays.sort(inputStr);

		String a1 = Arrays.toString(equalsStr);
		String b1 = Arrays.toString(inputStr);

		System.out.println(a1.equals(b1) ? "y" : "n");

	}

}