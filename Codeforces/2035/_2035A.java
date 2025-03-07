// Sliding

import java.util.*;

public class _2035A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            long n = sc.nextLong();
            long m = sc.nextLong();
            long r = sc.nextLong();
            long c = sc.nextLong();

            long res = m * (n - r);

            res += n * m - ((r - 1) * m + c) - (n - r);

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}