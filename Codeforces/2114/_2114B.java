// Not Quite a Palindromic String

import java.util.*;

public class _2114B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int one = 0;
            int zero = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    one++;
                } else {
                    zero++;
                }
            }

            int min = Math.max(one, zero) - n / 2;
            int max = one / 2 + zero / 2;

            if (k >= min && (k - min) % 2 == 0 && k <= max)
                System.out.println("YES");
            else
                System.out.println("No");
        }
        sc.close();
    }
}