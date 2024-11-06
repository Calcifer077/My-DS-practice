// Spell check

import java.util.*;

public class _1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            boolean T = false;
            boolean i = false;
            boolean m = false;
            boolean u = false;
            boolean r = false;

            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == 'T') {
                    T = true;
                }
                if (str.charAt(j) == 'i') {
                    i = true;
                }
                if (str.charAt(j) == 'm') {
                    m = true;
                }
                if (str.charAt(j) == 'u') {
                    u = true;
                }
                if (str.charAt(j) == 'r') {
                    r = true;
                }
            }

            if (T && i && m && u && r && n == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }
        sc.close();
    }
}