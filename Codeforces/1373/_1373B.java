// 01 Game

import java.util.*;

public class _1373B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // In this question we have to remove two adjacent distinct binary digits and
            // tell who will be the one that remvoes the last adjacent binary digits.

            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);

            int count = 0;

            while (true) {
                boolean flag = false;
                for (int i = 0; i < sb.length() - 1; i++) {
                    // Removee adjacent digits
                    if (sb.charAt(i) != sb.charAt(i + 1)) {
                        flag = true;
                        count++;
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i);
                        break;
                    }
                }

                // If we didn't remove any character or the length is less than 2, then we can't
                // remove any character
                if (!flag || sb.length() < 2) {
                    break;
                }
            }

            // If the last time adjacent digits were removed by 'Alice' else 'Bob'
            if (count % 2 == 1) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        sc.close();
    }
}