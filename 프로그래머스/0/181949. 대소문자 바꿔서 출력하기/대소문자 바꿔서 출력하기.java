import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i = 0; i < a.length(); i++){
            int temp = (int) a.charAt(i);
            
            if(65 <= temp && temp <= 90){ // 65 ~ 90 대문자
                result += (char) (temp + 32);
            } else if(97 <= temp && temp <= 122 ){ // 97 ~ 122 소문자
                result += (char) (temp - 32);
            } else {
                result += (char) temp;
            }
        }
        
        System.out.print(result);
    }
}