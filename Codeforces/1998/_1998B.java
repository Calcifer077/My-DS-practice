// Minimize Equal Sum Subarrays

import java.util.*;

public class _1998B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // There will always one pair whose sum will be equal that is the whole array

            // We can avoid any other such case by rotating the array by just one index, as
            // it is a permutation there will be no element of the same kind so the sum will
            // always differ.

            for (int i = 1; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print(arr[0]);
            System.out.println();
        }
        sc.close();
    }
}