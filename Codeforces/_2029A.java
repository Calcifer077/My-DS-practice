// Set

import java.util.*;

public class _2029A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();

            long res = 0;

            res = Math.max((r / k) - l + 1, 0);

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}