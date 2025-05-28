// Perfecto

import java.util.*;

public class _2071B {
    public static boolean check(long n) {
        long sum = (n * (n + 1)) / 2;

        return Math.sqrt(sum) == Math.floor(Math.sqrt(sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            if (check(n)) {
                System.out.println(-1);
            } else {
                StringBuilder sb = new StringBuilder();

                long i = 1;
                while (i <= n) {
                    if (check(i)) {
                        sb.append(i + 1);
                        sb.append(" ");
                        sb.append(i);
                        sb.append(" ");
                        i += 2;
                    } else {
                        sb.append(i);
                        sb.append(" ");
                        i++;
                    }
                }
                System.out.println(sb);
            }
        }
        sc.close();
    }
}