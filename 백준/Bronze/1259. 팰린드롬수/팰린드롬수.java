import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            String str = Integer.toString(num);
            String vivi = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                vivi = vivi + str.charAt(i);
            }
            int first = Integer.parseInt(str);
            int second = Integer.parseInt(vivi);

            if (first == second){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
