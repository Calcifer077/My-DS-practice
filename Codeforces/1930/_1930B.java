// Permutation Printing

import java.util.*;

public class _1930B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                int count1 = n;
                int count2 = 1;

                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print(count1 + " ");
                        count1 -= 2;
                    } else {
                        System.out.print(count2 + " ");
                        count2 += 2;
                    }
                }
            } else {
                int count1 = n - 1;
                int count2 = 1;

                for (int i = 0; i < n - 1; i++) {
                    if (i % 2 == 0) {
                        System.out.print(count1 + " ");
                        count1 -= 2;
                    } else {
                        System.out.print(count2 + " ");
                        count2 += 2;
                    }
                }
                System.out.print(n);
            }

            System.out.println();
        }
        sc.close();
    }
}