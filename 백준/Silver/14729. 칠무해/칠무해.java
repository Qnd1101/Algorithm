import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        float[] arr = new float[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Float.parseFloat(br.readLine());
        }

        Arrays.sort(arr);
        
        for(int i = 0; i < 7; i++){
            System.out.printf("%.3f\n", arr[i]);
        }
    }
}