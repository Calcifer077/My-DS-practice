// Comparison String

import java.util.*;

public class _1837B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int max = 1; // Since a single number is always a valid sequence
            int curr = 1;

            // Traverse the string to find the longest contiguous sequence
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    curr++;
                } else {
                    curr = 1;
                }
                max = Math.max(max, curr);
            }

            System.out.println(max + 1);
        }
        sc.close();
    }
}
