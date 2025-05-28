// Turtle Fingers: Count the Values of k

import java.util.*;

public class _1933C {
    public static long calc(int k, int a, int b, int x, int y) {
        long pow1 = (long) Math.pow(a, x);
        long pow2 = (long) Math.pow(b, y);

        return k * pow1 * pow2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();

            // In this questions we have to calculate unique value of 'k' such that
            // 'l == k * (a ^ x) * (b ^ y)'

            // Due to the given constraints in the question we can try out all the possible
            // scenarios for x and y starting from 0 to 'l'.

            // But instead of guessing 'k' we will take the value of 'a ^ x * b ^ y' into a
            // variable and divide 'l' by it if the remainder is zero, meaning that there is
            // a possiblilty of 'k', so we will store that.

            // To only store unique combinations.
            HashSet<Integer> set = new HashSet<>();

            // Trying out all possible combinations.
            for (int i = 0; Math.pow(a, i) <= l; i++) {
                for (int j = 0; Math.pow(b, j) <= l; j++) {
                    long pow1 = (long) Math.pow(a, i);
                    long pow2 = (long) Math.pow(b, j);
                    long temp = pow1 * pow2;

                    if (temp == 0)
                        continue;

                    if (temp > l)
                        break;

                    if (l % temp == 0) {
                        set.add((int) (l / temp));
                    }
                }
            }

            System.out.println(set.size());
        }
        sc.close();
    }
}