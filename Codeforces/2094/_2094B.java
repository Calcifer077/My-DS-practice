// Bobritto Bandito

import java.util.*;

public class _2094B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int left = Math.max(l, 0 - m);
            int temp = m;
            temp -= Math.abs(Math.max(l, 0 - m));

            int right = 0;
            if (temp > 0) {
                right += temp;
            }

            System.out.println(left + " " + right);
        }
        sc.close();
    }
}