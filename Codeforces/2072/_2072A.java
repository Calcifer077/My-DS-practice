// New World, New Me, New Array

import java.util.*;

public class _2072A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            if (k == 0) {
                System.out.println(0);
            } else {
                if (k < 0) {
                    k = -1 * k;
                }
                if (k > p * n) {
                    System.out.println(-1);
                } else {
                    // int temp = k;
                    int a = k / p;
                    k -= k / p * p;

                    if (k == 0) {
                        System.out.println(a);
                    } else {
                        a += 1;
                        System.out.println(a);
                    }

                }
            }

            t--;
        }
        sc.close();
    }
}