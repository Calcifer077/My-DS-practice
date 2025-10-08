package Codechef.START207D;

import java.util.*;

public class tourist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                int dist = Math.abs(a - x) + Math.abs(b - y);

                min = Math.min(min, dist);

            }

            System.out.println(min);
        }
        sc.close();
    }
}