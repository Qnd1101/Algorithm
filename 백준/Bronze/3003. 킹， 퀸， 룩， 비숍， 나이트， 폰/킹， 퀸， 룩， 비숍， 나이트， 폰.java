import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int[] cs = new int[6];
        int[] Basic = {1, 1, 2, 2, 2, 8};
        int[] Print = new int[6];

        for(int i = 0; i < cs.length; i++){
            cs[i] = sc.nextInt();
        }
        for(int i = 0; i < Basic.length; i++){
            Print[i] = Basic[i]-cs[i];
            System.out.println(Print[i]);
        }
        
    }
}
