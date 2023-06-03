import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스
        
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String num = sc.nextLine();
            String reverseNum = "";
            
            for(int j = num.length()-1; j >= 0; j--){
                reverseNum = reverseNum + num.charAt(j);
            }
            int sum = Integer.parseInt(num) + Integer.parseInt(reverseNum);
            String temp = Integer.toString(sum);

            boolean result = true;
            for(int j = 0; temp.length()/2 > j; j++){
                String[] str = temp.split("");
                if(!str[j].equals(str[str.length-1-j])){
                    result = false;
                }
            }
            System.out.println(result ? "YES" : "NO");
        }
        sc.close();
    }   
}