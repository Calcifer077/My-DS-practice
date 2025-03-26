// Split the multiset

import java.util.*;

public class _1988A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            while (n > 1) {
                n -= k - 1;
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}