// Fixing the expression

import java.util.*;

public class _2038N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();

            char a = str.charAt(0);
            char b = str.charAt(1);
            char c = str.charAt(2);

            if (a - '0' == c - '0') {
                System.out.println(a + "=" + c);
            } else if (a - '0' > c - '0') {
                System.out.println(a + ">" + c);
            } else {
                System.out.println(a + "<" + c);
            }

            t--;
        }
        sc.close();
    }
}