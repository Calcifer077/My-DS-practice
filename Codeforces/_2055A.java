// Two frogs

import java.util.*;

public class _2055A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }
        sc.close();
    }
}