// Dual trigger

import java.util.*;

public class _1951A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    count1++;
                }
            }

            if (count1 == 2) {
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                        count1 = 1;
                    }
                }
            }
            if ((n == 1 && count1 == 0) || (n == 2 && count1 == 0)) {
                System.out.println("YES");
            } else if (count1 % 2 == 0 && n != 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
