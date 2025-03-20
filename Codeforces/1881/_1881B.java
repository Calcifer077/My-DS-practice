// Three Threadlets

import java.util.*;

public class _1881B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = 3;
            // Try to make all numbers equal to smallest number
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long count = 0;
            for (int i = 1; i < n; i++) {
                // Trying to make all numbers equal to smallest number
                while (arr[i] > arr[0]) {
                    arr[i] -= arr[0];
                    count++;

                    if (arr[i] < arr[0]) {
                        count = 4;
                        break;
                    }
                    if (count > 3) {
                        break;
                    }
                }
            }

            if (count <= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}