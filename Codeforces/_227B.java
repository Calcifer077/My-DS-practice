// Effective approach

import java.util.*;

public class _227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        // 3 1 2
        // _ 2 3 1
        // Basically stores where each element is in the array.
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            arr[a] = i;
        }

        int m = sc.nextInt();
        long a = 0;
        long b = 0;

        // This loop calculates the number of comparisions.
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();

            // 'arr' stores where each element is. According to which number of comparisions
            // are calculated.
            // Suppose, a element is present at 1st position then a will be incremented by
            // 1(pos), and b will arr.length(n) - 1(pos) + 1;
            int pos = arr[q];

            a += pos;
            b += n - pos + 1;
        }

        System.out.println(a + " " + b);

        sc.close();
    }
}