import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int a = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);

        int round = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }

        System.out.println(round);

        sc.close();
    }
}
