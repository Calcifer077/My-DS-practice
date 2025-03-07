// Gorilla and Permutation

import java.util.*;

public class _1992C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            // In this question we have to find G(i) and F(i).
            // G(i) is the sum of prefix which have values smaller or equal to 'm'
            // F(i) is the sum of prefix which have values greater or equal to 'k'
            // We have to maximize F(i) - G(i).

            // To maximize this we want F(i) to be maximum and G(i) to be minimum, F(i) can
            // be maximum if values greater than 'k' are included many number of times. And
            // G(i) will be minimum if values less than equal to are inluded lesser number
            // of times.

            for (int i = n; i >= k; i--) {
                System.out.print(i + " ");
            }
            for (int i = k - 1; i > m; i--) {
                System.out.print(i + " ");
            }

            for (int i = 1; i <= m; i++) {
                System.out.print(i + " ");
            }

            System.out.println();

            t--;
        }
        sc.close();
    }
}