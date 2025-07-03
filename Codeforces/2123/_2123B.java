// Tournament

import java.util.*;

public class _2123B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int a = arr[j - 1];

            Arrays.sort(arr);
            if (a == arr[n - 1]) {
                System.out.println("YES");
            } else {
                if (k > 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
        sc.close();
    }
}