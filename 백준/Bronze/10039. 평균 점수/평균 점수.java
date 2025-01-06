import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        int total = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if(n[i] >= 40) {
                total += n[i];
            } else {
                total += 40;
            }
        }

        System.out.println(total/5);
    }
}