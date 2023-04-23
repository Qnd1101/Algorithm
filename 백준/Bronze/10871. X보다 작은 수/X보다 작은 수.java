import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] X = new int[n];

        for(int i = 0; i < X.length; i++){
            X[i] = sc.nextInt();
            if(x>X[i]) {
                System.out.print(X[i]+" ");
            }
        }
    }
}
