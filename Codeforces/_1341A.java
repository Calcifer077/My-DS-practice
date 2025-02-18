// Nastya and Rice

import java.util.*;

public class _1341A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            float n = sc.nextFloat();
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float d = sc.nextFloat();

            // Find the minimum and maximum bound and iterate in that region.

            // Minimum weight of rice
            float minW = a - b;
            // Maximum weight of rice
            float maxW = a + b;

            // Minimum total weight
            float min = c - d;

            // Maximum total weight
            float max = c + d;

            boolean flag = false;
            for (float i = min; i <= max; i++) {
                if (i / n >= minW && i / n <= maxW) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            t--;
        }
        sc.close();
    }
}