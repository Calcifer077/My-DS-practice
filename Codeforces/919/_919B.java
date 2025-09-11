// Perfect Number

import java.util.*;

public class _919B {
    public static boolean solve(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;

            if (sum > 10)
                return false;
        }

        return sum == 10;
    }

    public static void main(String[] args) {
        // BRUTE FORCE
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        long curr = 18;

        while (k > 0) {
            curr++;
            if (solve(curr)) {
                k--;
            }

            if (k == 0)
                System.out.println(curr);
        }

        sc.close();
    }
}