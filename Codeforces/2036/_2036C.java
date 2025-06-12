// Anya and 1100

import java.util.*;

public class _2036C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            StringBuilder sb = new StringBuilder(s);

            int count = 0;
            for (int i = 0; i < sb.length() - 3; i++) {
                if (sb.substring(i, i + 4).equals("1100")) {
                    count++;
                }
            }

            int q = sc.nextInt();
            for (int j = 0; j < q; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                for (int i = Math.max(0, a - 4); i <= Math.min(a - 1, sb.length() - 4); i++) {
                    if (sb.substring(i, i + 4).equals("1100")) {
                        count--;
                    }
                }

                char ch = (char) (b + '0');
                sb.setCharAt(a - 1, ch);

                for (int i = Math.max(0, a - 4); i <= Math.min(a - 1, sb.length() - 4); i++) {
                    if (sb.substring(i, i + 4).equals("1100")) {
                        count++;
                    }
                }

                if (count > 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}