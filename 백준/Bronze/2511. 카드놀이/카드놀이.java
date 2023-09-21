import java.util.Scanner;
import java.util.Arrays ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int a = 0;
        int b = 0;
        String 마지막라운드승자 = " ";

        for (int i = 0; i < 10; i++){ // 10라운드
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++ ){
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            if (A[i] > B[i]){
                a += 3;
                마지막라운드승자 = "A";
            }else if (A[i] < B[i]){
                b += 3;
                마지막라운드승자 = "B";
            }else{
                a += 1; b += 1;
            }
        }
            System.out.println(a+" "+b);

             if (a > b){
                System.out.println("A");
             } else if (a < b){
                System.out.println("B");
             } else {
                    if (마지막라운드승자 == " "){
                        System.out.println("D");
                    }else {
                        System.out.println(마지막라운드승자);
                    }

            }
    }
}