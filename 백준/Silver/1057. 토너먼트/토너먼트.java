import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int a = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);
        
        List<Integer> num = new ArrayList<>();
        
        int result = 0;
        int round = 0;
        
        // 리스트에 n개의 번호를 지정
        for(int i = 0; i < n; i++) {
        	num.add(i+1);
    	}
        
        // 0 일때만 돌아감
        while(result == 0) {
        	round += 1;
        	
        	for(int i = 0; i < num.size()-1; i++) {
        		if ((num.get(i) == a || num.get(i) == b) &&
        			(num.get(i + 1) == a || num.get(i + 1) == b)) {
        			result = round;	
        			break;
        		} else if (num.get(i) == a || num.get(i) == b) {
        			num.remove(i+1);
        		} else if(num.get(i + 1) == a || num.get(i + 1) == b) {
        			num.remove(i);
        		} else {
        			num.remove(i);
        		}
        	}
        	
        	if(num.size() == 1) {
        		round = -1;
        	}
        }
        
        System.out.println(result);
        
        sc.close(); // Scanner 닫기
    }
}
