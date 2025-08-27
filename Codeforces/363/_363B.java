// Fence

import java.util.*;

public class _363B {
    public static void main(String[] args) {
        // How the below approach works is? We need to find 'k' consecutive smallest sum
        // elements, we will assume that the first 'k' element is the smallest, and try
        // to find iteratively if there is any other 'k' consecutive smaller element
        // than this, if so update it.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (i < k)
                sum += arr[i];
        }

        // Indexing is one based.
        int min = 1;
        long minSum = sum;
        for (int i = 1; i <= n - k; i++) {
            sum += arr[i + k - 1];
            sum -= arr[i - 1];

            if (sum < minSum) {
                minSum = sum;
                min = i + 1;
            }
        }

        System.out.println(min);

        sc.close();
    }
}