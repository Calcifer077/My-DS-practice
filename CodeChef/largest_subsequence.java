package CodeChef;

import java.util.*;

public class largest_subsequence {

    public static int solve(String str, int n) {
        if (n <= 2) {
            return 1;
        }

        int a = 0;
        int b = 0;
        int ab = 0;
        int ba = 0;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                ab += 2;
            }
            if (str.charAt(i) == 'b' && str.charAt(i + 1) == 'a') {
                ba += 2;
            }
            if (str.charAt(i) == 'a') {
                a++;
            }
            if (str.charAt(i) == 'b') {
                b++;
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (str.charAt(i - 1) == 'a' && str.charAt(i) == 'b') {
                ab += 2;
            }
            if (str.charAt(i - 1) == 'b' && str.charAt(i) == 'a') {
                ba += 2;
            }
            if (str.charAt(i) == 'a') {
                a++;
            }
            if (str.charAt(i) == 'b') {
                b++;
            }
        }

        int sum = ab + ba;
        int res = Math.max(a, b);
        res = Math.max(res, sum);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            System.out.println(solve(str, n));
            t--;
        }
        sc.close();
    }
}
