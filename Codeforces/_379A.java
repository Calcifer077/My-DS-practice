// New year candles

import java.util.*;

public class _379A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 'a' is the initial number of candles.
        int a = sc.nextInt();
        // 'b' is the number of burn out candle that he can use to make new candles.
        int b = sc.nextInt();

        // We have to find total number of candles.

        // Firstly 'a' can be definitely used by him.
        int res = a;
        // As there will be some remainder in making candles which can be used in the
        // future.
        int rem = 0;
        int temp = 0;

        // Here, we are checking for 'a >= b' because if 'b' is more than 'a' then we
        // can't make a single candle because there needs to be atleast 'b' leftovers to
        // form a new candle.
        while (a >= b) {
            // To make new candle.
            temp = a / b;
            res += temp;

            // Calculating leftovers
            rem = a % b;
            a = temp + rem;
        }

        System.out.println(res);
        sc.close();
    }
}