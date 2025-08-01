// Sum of Cubes

import java.util.*;

public class _1490C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();

            boolean flag = false;

            long start = 1;
            long end = (long) Math.sqrt(x);

            while (start <= end) {
                long a = start * start * start;
                long b = end * end * end;

                long res = a + b;
                if (res == x) {
                    flag = true;
                    break;
                } else if (res > x) {
                    end--;
                } else {
                    start++;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}