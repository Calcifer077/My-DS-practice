// Shovels and swords

import java.util.*;

public class _1366A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            // In the question it is asked how many times we can subtract 3 from given items

            // Why 3? Beacuse both in case of shovels(2 sticks and 1 diamond) and swords(1
            // stick and 2 diamonds) we need three objects.

            // Another way: We need 'x' diamonds and '2y' sticks to build 'x' shovels.
            // We need '2x' diamonds and 'y' sticks to build 'y' swords
            // Total number of items used: x + 2y + 2x + y = 2x + 3y
            // (a + b) - (3x + 3y) = 0. We zero because we have to maximize them.
            // solving for x and y we get (a + b) /3
            System.out.println(Math.min(a, Math.min(b, (a + b) / 3)));
            t--;
        }
        sc.close();
    }
}
