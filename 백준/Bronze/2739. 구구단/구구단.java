import java.util.Scanner;
import java.util.Arrays ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i <= n; i++){
            for (int j = 1; j<=9; j++){
                System.out.println(i+" * "+j+" = "+ (i*j));
            }
        }
    }
}