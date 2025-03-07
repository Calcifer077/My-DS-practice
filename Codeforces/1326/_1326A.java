// Bad Ugly Numbers

import java.util.*;

public class _1326A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println(-1);
            } else {
                // For a number to be divisible by 8 last 3 digits should be divisible by 8. 558
                // is not divisible by 8.

                // Any number whose last place is neither zero nor 5 is not divvisible by 5.
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(5);
                }
                System.out.print(8);
                System.out.println();
            }
            t--;
        }
        sc.close();
    }
}