import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] sum = new int[a][b];
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
            	arr2[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}