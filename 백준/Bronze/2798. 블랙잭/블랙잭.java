import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ar = new int[N];
        for(int i = 0; i < N; i++){
            ar[i] = sc.nextInt();
        }
        int ij = 0;
        int ijk = 0;
        int max = 0;

        for (int i = 0; i < ar.length; i++){
            ij = 0;
            for (int j = i+1; j < ar.length; j++){
                ij = ar[i] + ar[j];
                for(int k = j+1; k < ar.length; k++){
                    ijk = ij + ar[k];
                    if(ijk <= M && ijk > max){
                        max = ijk;
                    }
                }
            }
        }
        System.out.println(max);
    }
}