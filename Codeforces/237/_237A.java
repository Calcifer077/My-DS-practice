// Free Cash

import java.util.*;

public class _237A {
    public static void main(String[] args) {
        // Have to count max consecutive similar times
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int globalMax = 1;
        int h = sc.nextInt();
        int m = sc.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == h && b == m) {
                count++;
            } else {
                globalMax = Math.max(globalMax, count);
                count = 1;
            }
            h = a;
            m = b;
        }

        globalMax = Math.max(globalMax, count);

        System.out.println(globalMax);
        sc.close();
    }
}