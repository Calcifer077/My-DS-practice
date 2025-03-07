// Game 23

import java.util.*;

public class _1141A {
    public static int solve(int a, int b) {
        if (b % a != 0) {
            return -1;
        }

        long d = b / a;

        int count = 0;
        while (d % 2 == 0) {
            d /= 2;
            count++;
        }

        while (d % 3 == 0) {
            d /= 3;
            count++;
        }

        if (d != 1) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));
        sc.close();
    }
}