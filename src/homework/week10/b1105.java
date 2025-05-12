import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1105 {
    public static void main(String[] args) throws IOException {
        String[] s = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int n = s[0].length();
        if(n!=s[1].length()) System.out.println("0");
        else{
            int count = 0;
            for(int i = 0; i < n; i++){
                if(s[0].charAt(i)==s[1].charAt(i)){
                    if(s[0].charAt(i)=='8') count++;
                }
                else break;
            }
            System.out.println(count);
        }
    }
}
