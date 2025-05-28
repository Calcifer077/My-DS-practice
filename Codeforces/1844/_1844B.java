// Permutations & Primes

import java.util.*;

public class _1844B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(2 + " " + 1);
            } else {
                int arr[] = new int[n];
                arr[n / 2] = 1;
                arr[n - 1] = 2;
                int count = 3;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        arr[i] = count;
                        count++;
                    }
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}