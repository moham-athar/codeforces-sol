import java.util.*;
public class Bit {
    public static void main(String args[]) throws java.lang.Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int cnt = 0;
       for (int i = 0; i < n; i++) {
        String str = sc.next();
        if (str.charAt(1) == '+') cnt++;
        else cnt--;
       }
       System.out.println(cnt);
       sc.close();
    }
}