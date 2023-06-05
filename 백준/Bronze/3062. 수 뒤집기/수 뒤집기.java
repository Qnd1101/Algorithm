import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스
        
        sc.nextLine(); // 다음 입력을 받기 위해 한 줄을 소비함
        for(int i = 0; i < t; i++){
            String num = sc.nextLine(); // 숫자를 입력받아 문자열 타입으로 저장
            String reverseNum = ""; // 뒤집은 수를 저장할 빈 문자열 생성
            
            for(int j = num.length()-1; j >= 0; j--){
                reverseNum = reverseNum + num.charAt(j); // 뒤집은 수 저장
            }
						
						// 입력받은 수와 뒤집은 수를 정수형으로 변환하여 더함
            int sum = Integer.parseInt(num) + Integer.parseInt(reverseNum);

						// 더한 값을 문자열로 변환
            String temp = Integer.toString(sum);

            boolean result = true; // 앞과 뒤가 같은지 여부를 확인하는 변수
            for(int j = 0; temp.length()/2 > j; j++){
                String[] str = temp.split(""); // 문자열을 배열로 변환
                if(!str[j].equals(str[str.length-1-j])){
                    result = false; // 왼쪽과 오른쪽 문자열이 다르면 false 저장 후 반복문 종료
										break;
                }
            }
            System.out.println(result ? "YES" : "NO");
        }
        sc.close();
    }   
}