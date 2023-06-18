import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        String[] arr = new String[N];
 
        sc.nextLine();  // 개행 버림
 
        // N개의 단어를 입력 받아 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        
        // 문제 조건에 맞게 정렬
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우 사전 순으로 정렬
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } 
                // 그 외의 경우 단어 길이순으로 정렬
                else {
                    return s1.length() - s2.length();
                }
            }
        });
 
        // 중복되지 않는 단어들을 출력
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
        
        sc.close();
    }
 
}
