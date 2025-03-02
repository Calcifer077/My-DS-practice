// Black and White Stripe

import java.util.*;

public class _1690D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();
            char ch[] = s.toCharArray();

            int white = 0;
            int min = Integer.MAX_VALUE;

            // What I have done is:
            // 'k' is the length of black stripe that we have to achieve.
            // We have to form 'k' stripe of Black so we will check for all 'k' stripe and
            // find minimum number of whites in it.

            // First check first 0 to k and count number of white in it.
            // Then go through every other stripe of 'k'

            // If the character we just left behind is a 'W' we will reduce the number of
            // white by one as it doesn't exist in our answer any more.

            // If the next character is 'W' then we will add 1 to white as one more white
            // has been added to our stripe
            for (int i = 0; i < k; i++) {
                if (ch[i] != 'B') {
                    white++;
                }
            }

            min = Math.min(min, white);

            for (int i = 1; i <= n - k; i++) {
                if (ch[i - 1] == 'W') {
                    white--;
                }
                if (ch[i + k - 1] == 'W') {
                    white++;
                }

                min = Math.min(min, white);
            }

            System.out.println(min);
            t--;
        }
        sc.close();
    }
}