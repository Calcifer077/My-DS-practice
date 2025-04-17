// Is It a Cat?

import java.util.*;

public class _1800A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder();
            String s1 = s.toLowerCase();

            sb.append(s1.charAt(0));

            for (int i = 1; i < n; i++) {
                if (s1.charAt(i - 1) != s1.charAt(i)) {
                    sb.append(s1.charAt(i));
                }
            }

            if (sb.toString().equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}