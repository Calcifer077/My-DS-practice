// Swap and delete

import java.util.*;

public class _1913B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        while (t1 > 0) {
            String s = sc.next();

            int n = s.length();

            int one = 0;
            int zero = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    one++;
                } else {
                    zero++;
                }
            }

            StringBuilder t = new StringBuilder();
            // We will traverse 's'.

            // In case we encounter '1' we will append '0' in that place if it is available
            // to us.

            // In case we encounter '0' we will append '1' in that place if it is available
            // to us.

            // This will take care of swapping which doesn't cost anything

            // The remaining characters of 's' will have to be deleted which is the result
            // of 's.length() - t.length'
            for (char c : s.toCharArray()) {
                if (c == '1' && zero > 0) {
                    t.append('0');
                    zero--;
                } else if (c == '0' && one > 0) {
                    t.append('1');
                    one--;
                } else {
                    break;
                }
            }

            System.out.println(n - t.length());
            t1--;
        }
        sc.close();
    }
}