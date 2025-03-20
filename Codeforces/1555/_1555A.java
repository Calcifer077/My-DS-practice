// PizzaForces

import java.util.*;

public class _1555A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            if (n <= 6) {
                System.out.println(15);
            } else {
                if (n % 2 == 0) {
                    System.out.println(n / 2 * 5);
                } else {
                    System.out.println((n + 1) / 2 * 5);
                }
            }

        }
        sc.close();
    }
}