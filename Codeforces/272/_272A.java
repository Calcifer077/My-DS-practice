// Dima and Friends

import java.util.*;

public class _272A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        long res = 0;

        for (int i = 0; i < 5; i++) {
            int temp = sum;
            int j = i + 1;
            temp += j;

            if ((temp - 1) % (n + 1) != 0) {
                res++;
            }
        }

        System.out.println(res);

        sc.close();
    }
}