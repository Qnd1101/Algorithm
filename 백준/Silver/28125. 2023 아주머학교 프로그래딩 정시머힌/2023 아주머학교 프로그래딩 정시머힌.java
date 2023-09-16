import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strMod = {"@", "[", "!", ";", "^", "0", "7", "\\\\\'", "\\\'"};
        String[] strOrg = {"a", "c", "i", "j", "n", "o", "t", "w", "v"};
        for(int i = 0; i < n; i++){
            String inputStr = br.readLine();

            int count = 0;
            for(int j = 0; j < 9; j++){
                count += countChar(inputStr, strMod[j]);
                inputStr = inputStr.replace(strMod[j], strOrg[j]);
            }

            if((inputStr.length()+1) / 2 <= count){
                System.out.println("I don't understand");
            }else {
                System.out.println(inputStr);
            }
        }

    }
    public static int countChar(String str, String ch) {
        return (str.length() - str.replace(String.valueOf(ch), "").length()) / ch.length(); // awdawd\\'(9) - awdawdw(7) = 2
    }
}

/*
6
a;ou
d!sc0\'ery
kdollar
\'e[70r
a;;;;ou
\'\'a
 */
