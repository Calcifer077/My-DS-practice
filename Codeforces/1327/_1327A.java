// Sum of Odd Integers

import java.util.*;

public class _1327A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (k * k > n) { // The sum of the first k odd numbers is k^2
                System.out.println("NO");
            } else if ((n % 2) == (k % 2)) { // n and k should have the same parity
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}