package Codechef.START206D;

import java.util.*;

public class cyclic_shift_minimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];

            int count = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = count;
                count += 2;
                if (count > n) {
                    count = 2;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}