// Board Moves

import java.util.*;

public class _1353C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            // We will try to move all pieces to center.
            // Start from lowest size that is '1' in this case answer will be just 0.
            // Next can be 3 in which we have 8 layers each at a distance of 1.
            // Next can be 5 in distance will be 2 and you can get all pieces at center
            // using 8 * 4 moves.
            // 8 * (1 * 1 + 2 * 2 + 3 * 3....)
            long res = 0;
            for (int i = 1; i <= n / 2; i++) {
                res += (long) i * i;
            }

            System.out.println(res * 8);
            t--;
        }
        sc.close();
    }
}