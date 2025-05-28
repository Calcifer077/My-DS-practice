// Boboniu Likes to Color Balls

import java.util.*;

public class _1395A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long r = sc.nextLong();
            long g = sc.nextLong();
            long b = sc.nextLong();
            long w = sc.nextLong();

            boolean red = r % 2 == 0;
            boolean green = g % 2 == 0;
            boolean blue = b % 2 == 0;
            boolean white = w % 2 == 0;

            int count = 0;
            if (!red)
                count++;
            if (!green)
                count++;
            if (!blue)
                count++;
            if (!white)
                count++;

            if (count <= 1) {
                System.out.println("YES");
            } else {
                if (r == 0 || g == 0 || b == 0) {
                    System.out.println("NO");
                } else {
                    r--;
                    g--;
                    b--;
                    w += 3;

                    red = r % 2 == 0;
                    green = g % 2 == 0;
                    blue = b % 2 == 0;
                    white = w % 2 == 0;

                    count = 0;

                    if (!red)
                        count++;
                    if (!green)
                        count++;
                    if (!blue)
                        count++;
                    if (!white)
                        count++;

                    if (count <= 1) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        sc.close();
    }
}