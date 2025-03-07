// Profitable Interest Rate

import java.util.*;

public class _2024A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= b) {
                System.out.println(a);
            } else {
                int diff = 2 * (b - a);
                int res = b - diff;
                if (res <= 0) {
                    System.out.println(0);
                } else {
                    System.out.println(res);
                }
            }
            t--;
        }
        sc.close();
    }
}