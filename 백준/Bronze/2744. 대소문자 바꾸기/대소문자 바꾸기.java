import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strCase = br.readLine(); // 문자열 입력
        String temp = ""; // 바꾼 문자를 저장하는 변수

        for(int i = 0; i < strCase.length(); i++){ // 문자열의 길이 만큼 반복
            if(Character.isUpperCase(strCase.charAt(i))){ // 현재 검색한 문자가 대문자 일 경우
                temp += Character.toLowerCase(strCase.charAt(i)); // 소문자로 변경하여 temp에 저장한다.
            }else { // 아닌 경우
                temp += Character.toUpperCase(strCase.charAt(i)); // 대문자로 변경하여 temp에 저장한다.
            }
        }
        System.out.println(temp); // 출력
    }
}
