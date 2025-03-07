// Journey

import java.util.*;

public class _2051B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long sum = a + b + c;
            long res = n / sum;

            n = n - (res * sum);
            res = 3 * res;

            int i = 0;
            while (n > 0) {
                if (i == 0) {
                    n = n - a;
                    res++;
                } else if (i == 1) {
                    n = n - b;
                    res++;
                } else if (i == 2) {
                    n = n - c;
                    res++;
                }

                i++;

                if (i == 3) {
                    i = 0;
                }
            }
            System.out.println(res);
            t--;
        }
        sc.close();
    }
}