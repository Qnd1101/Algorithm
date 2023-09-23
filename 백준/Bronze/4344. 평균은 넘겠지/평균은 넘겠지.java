import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int temp = 0;
        float count = 0;
        float sum = 0;

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] num = new int[n];
            for(int j = 0; j < n; j++){
                num[j] = sc.nextInt();
                temp += num[j];
            }
            sum = temp / n;

            for(int j = 0; j < n; j++){
                if(num[j] > sum){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", count / n * 100);
            temp = 0;
            sum = 0;
            count = 0;
        }
    }
}