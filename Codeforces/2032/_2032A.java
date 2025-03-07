// Circuit

import java.util.*;

public class _2032A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[2 * n];
            int one = 0;
            int zero = 0;
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] == 1) {
                    one++;
                } else if (arr[i] == 0) {
                    zero++;
                }
            }

            int on = 0;
            int off = 0;

            if (2 * n == one) {
                on = 0;
            } else {
                if (one == zero) {
                    on = one;
                } else if (one > zero) {
                    on = zero;
                } else if (one < zero) {
                    on = one;
                }
            }

            if (on > n) {
                on = n;
            }

            off = one % 2;

            System.out.print(off + " " + on);
            System.out.println();
            t--;
        }
        sc.close();
    }
}