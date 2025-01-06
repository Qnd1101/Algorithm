import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "Tie";

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int a = 0;
        int b = 0;



        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }

        System.out.println(a == b ? result : (a > b ? "A" : "B"));

    }
}