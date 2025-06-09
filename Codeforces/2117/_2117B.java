// Shrink

import java.util.*;

public class _2117B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];
            arr[0] = 2;
            arr[1] = 3;
            arr[n - 1] = 1;

            int start = 2;
            int end = n - 2;

            boolean flag = true;
            int count = n;
            while (start <= end) {
                if (flag) {
                    arr[start] = count;
                    start++;
                    flag = false;
                } else {
                    arr[end] = count;
                    end--;
                    flag = true;
                }
                count--;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}