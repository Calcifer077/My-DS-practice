// BAN BAN

import java.util.*;

public class _1747B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n > 1) {
                System.out.println(n / 2 + n % 2);

                int i = 2;
                int j = 3 * n;
                while (i <= j) {
                    System.out.println(i + " " + j);
                    i += 3;
                    j -= 3;
                }
            } else {
                System.out.println(n);
                System.out.println(1 + " " + 2);
            }
        }
        sc.close();
    }
}
