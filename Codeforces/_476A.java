// Dreamoon and Stairs

import java.util.*;

public class _476A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();

        // Minimum number of moves.
        double lowerBound = Math.ceil(n / 2);
        // Maximum nuber of moves.
        double upperBound = n;

        int pos = -1;
        for (double i = lowerBound; i <= upperBound; i++) {
            if (i % m == 0) {
                pos = (int) i;
                break;
            }
        }

        System.out.println(pos);
        sc.close();
    }
}