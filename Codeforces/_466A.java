// Cheap Travel

import java.util.*;

public class _466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // If 'n' is divisible by 'm' then we we can buy 'n' number of tickets
        if (n % m == 0) {
            System.out.println(Math.min(n * a, (n / m) * b));
        } else {
            // Now there are two ways to buy ticket, she can buy ticket for 'n' rides only
            // or can go beyond that if it is cheaper.

            // If the first option is cheaper then she have to buy at least n % m tickets
            // with 'a' because they can't be bought with 'b'
            int res = (n % m) * a;

            res += Math.min((n - n % m) * a, ((n - n % m) / m) * b);

            System.out.println((int) Math.min(res, Math.ceil((double) n / m) * b));
        }
        sc.close();
    }
}