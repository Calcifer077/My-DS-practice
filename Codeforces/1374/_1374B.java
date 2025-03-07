// Multiply by 2, divide by 6

import java.util.*;

public class _1374B {
    public static int solve(int n) {
        int count2 = 0;
        int count3 = 0;
        while (n % 2 == 0) {
            n /= 2;
            count2++;
        }

        while (n % 3 == 0) {
            n /= 3;
            count3++;
        }

        if (n == 1 && count2 <= count3) {
            return 2 * count3 - count2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(solve(n));
            t--;
        }
        sc.close();
    }
}