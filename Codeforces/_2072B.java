// Having Been a Treasurer in the Past, I Help Goblins Deceive

import java.util.*;

public class _2072B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            long minus = 0;
            long underscore = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '-') {
                    minus++;
                } else {
                    underscore++;
                }
            }

            if (minus < 2 || underscore < 1) {
                System.out.println(0);
            } else {
                long firstHalf = minus / 2;
                long secondHalf = minus - firstHalf;

                long a = firstHalf * secondHalf;
                long res = underscore * a;

                System.out.println(res);
            }
            t--;
        }
        sc.close();
    }
}
