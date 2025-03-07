// Fireworks

import java.util.*;

public class _1945B {

    public static long lcm(long a, long b) {
        long ans = (a > b) ? a : b;

        // Checking for a smallest number that
        // can de divided by both numbers
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();

            long res = m / a + m / b + 2;
            System.out.println(res);
            t--;
        }
        sc.close();
    }
}