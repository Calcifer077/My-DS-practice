// Even odds

import java.util.*;

public class _318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long a = (long) Math.ceil((double) n / 2);

        if (k <= a) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - a));
        }
        sc.close();
    }
}