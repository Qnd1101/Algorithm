import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n1= sc.nextInt();
        long n2 = sc.nextInt();

        System.out.println(sum(n1, n2));
    }

    static long sum(long n1, long n2){
        return (n1+n2)*(n1-n2);
    }
}