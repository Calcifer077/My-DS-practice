// Monsters

import java.util.*;

public class _1849B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans[][] = new int[n][2];

            // We don't need to check for the every value. If a value is divisible by 'k',
            // we will add 'k' in its place so that it will be reduced to zero in one go.
            // For values that are greater than k or less than k, we have taken their
            // modulus.
            // If values are greater than 'k' then we have to go to these values more then
            // one time until they become zero. To save time, we will only consider their
            // modulo.
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % k == 0) {
                    ans[i][0] = k;
                } else {
                    ans[i][0] = x % k;
                }
                ans[i][1] = i + 1;
            }

            Arrays.sort(ans, (a, b) -> Integer.compare(b[0], a[0]));
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i][1] + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}