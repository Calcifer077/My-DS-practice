// Double Cola

import java.util.*;

public class _82A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        String[] names = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

        long drinks = 1;

        while (n > 5 * drinks) {
            // Total number of drinks
            n -= 5 * drinks;
            // As every time number of drinks double
            drinks *= 2;
        }

        // Find the offset of `n` in the current cycle
        int index = (int) ((n - 1) / drinks);
        System.out.println(names[(int) index]);
    }
}
