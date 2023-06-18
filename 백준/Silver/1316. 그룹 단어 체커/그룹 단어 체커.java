import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt(); // 단어의 개수
        int count = n; // 단어의 수를 초기값으로 지정하고 그룹 단어가 아니면 -1 해줌
        
        for(int i = 0; i < n; i++) {
        	String str = sc.next(); // 단어 입력
        	boolean[] cheak = new boolean[26]; // 알파벳 개수크기의 배열 
        	for(int j = 0; j < str.length()-1; j++) {
        		if(str.charAt(j) != str.charAt(j+1)) { // 현재 문자와 다음 문자가 다를 경우 
        			if(cheak[str.charAt(j+1)-97] == true) { // 해당 문자가 이미 나온 적이 있는 경우 
        				count--;
        				break;
        			}
        		}
        		cheak[str.charAt(j)-97] = true; // 해당 문자가 이미 나온 적이 있는 경우를 체크하기 위해 true로 바꾸어줌
        	}
        }
        
        System.out.println(count); // 그룹 단어 개수
    }
 
}