// Odd Selection

import java.util.*;

public class _1363A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            // You can form a odd number by adding a even number and a odd number.

            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[n];
            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            // 'even == n', means that all number are even so you can't possibly form a sum
            // of odd

            // 'x % 2 == 0 && even == 0', We need even amount of number and even is also
            // equal to 0. How will this fail.
            // Suppose you have even number of odd elements then you can't possibly form an
            // odd amount from them, because odd numbers added up even number of times gives
            // sum as even

            // 'x == n && odd % 2 == 0', we need to use all elements but we don't have any
            // odd number, so their sum is odd.
            if (even == n || (x % 2 == 0 && even == 0) || (x == n && odd % 2 == 0)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
        sc.close();
    }
}