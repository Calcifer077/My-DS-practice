package CodeChef;

import java.util.*;

public class binary_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            float n = sc.nextFloat();
            float k = sc.nextFloat();

            if (n % 2 == 0) {
                if (Math.floor(n / 2) == k) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (Math.ceil(n / 2) == k || Math.floor(n / 2) == k) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

            t--;
        }
        sc.close();
    }
}
