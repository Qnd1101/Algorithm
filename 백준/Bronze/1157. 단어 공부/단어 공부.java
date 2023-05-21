import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // 문자열을 입력받음
        int[] intArr = new int[26]; // 알파벳 개수만큼 배열을 선언. 단어의 개수를 담는 배열.

        for (int i = 0; i < str.length(); i++){
 
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) { // 대문자의 범위 : 65 ~ 90
                intArr[str.charAt(i) - 65]++;	// 단어의 갯수를 배열에 저장
            }
            
            else {	// 소문자의 범위 : 97 ~ 122
                intArr[str.charAt(i) - 97]++; // 단어의 갯수를 배열에 저장
            }
        }
        // max의 초깃값을 0으로 해버리면 밑에 for 문에서 else if 문에 적합하게 되어 -1을 저장.
        // 문자의 빈도수를 정확하게 하기 위한것도 있음.
        int max = -1;
		char ch = '?';
        
		for (int i = 0; i < 26; i++) { // 알파벳 개수만큼 반복

			if (intArr[i] > max) { // 조건에 성립할 경우 
				max = intArr[i]; // 최댓값을 저장
				ch = (char) (i + 65); // 대문자를 출력해야하기 때문에 i + 65
			} 
			else if (intArr[i] == max) { // 조건에 성립할 경우 
				ch = '?'; // max와 같을경우
			}
		}

        System.out.println(ch);
        sc.close();
    }
}