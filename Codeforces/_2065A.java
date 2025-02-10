// Skibidus and Amog'u

import java.util.*;

public class _2065A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();

            StringBuilder sb = new StringBuilder(s);
            if (sb.length() >= 2) {
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);

                sb.append('i');
                System.out.println(sb);

            }
            t--;
        }
        sc.close();
    }
}