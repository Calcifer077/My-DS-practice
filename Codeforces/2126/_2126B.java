// No Casino in the Mountains

import java.util.*;

public class _2126B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // greedy approach
            int count = 0;
            int curr = 0;
            int i = 0;
            while (i < n) {
                if (arr[i] == 0)
                    curr++;
                else
                    curr = 0;

                if (curr == k) {
                    count++;
                    curr = 0;
                    i++;
                }
                i++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}