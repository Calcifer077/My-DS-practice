// Count the Number of Pairs

import java.util.*;

public class _1800B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();
            // This is the frequency map for all uppercase letters.
            int[] upper = new int[26];
            // Frequency map for all lowercase letters.
            int[] lower = new int[26];

            // What I will do is: compare lowercase with uppercase, if there exists a pair
            // of this lowercase we will increment the result and decrement values in both
            // lowercase and uppercase.

            // When we have expanded all the pairs we will check for even number of
            // frequency in lower and upper array. If they are even and we can increment
            // them, have some value of 'k' then increment them, else return.

            // Creating frequency counter
            for (char c : s.toCharArray()) {
                if (c >= 65 && c <= 90) {
                    upper[c - 'A']++;
                } else {
                    lower[c - 'a']++;
                }
            }

            // Check for pairs
            long count = 0;
            for (int i = 0; i < 26; i++) {
                if (lower[i] == 0 || upper[i] == 0) {
                    continue;
                }
                if (lower[i] >= upper[i]) {
                    count += upper[i];
                    lower[i] -= upper[i];
                    upper[i] = 0;
                } else {
                    count += lower[i];
                    upper[i] -= lower[i];
                    lower[i] = 0;
                }
            }

            // Below two loops are used to check for all possiblilty where we can make a
            // pair by modifying characters.
            for (int j = 0; j < 26; j++) {
                int a = (int) Math.floor(lower[j] / 2);
                if (a <= k && k > 0) {
                    count += a;
                    k -= a;
                } else if (k > 0) {
                    count += k;
                    k = 0;
                }
            }

            for (int j = 0; j < 26; j++) {
                int a = (int) Math.floor(upper[j] / 2);
                if (a <= k && k > 0) {
                    count += a;
                    k -= a;
                } else if (k > 0) {
                    count += k;
                    k = 0;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}