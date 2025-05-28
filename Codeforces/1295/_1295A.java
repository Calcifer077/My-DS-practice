// Display The Number

import java.util.*;

public class _1295A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            if (n % 2 == 1) {
                System.out.print(7);
                n -= 3;
            }

            while (n > 0) {
                System.out.print(1);
                n -= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}