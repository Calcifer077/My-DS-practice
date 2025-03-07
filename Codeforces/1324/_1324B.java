// Yet Another Palindrome Problem

import java.util.*;

public class _1324B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean flag = false;

            // Brute forcing
            // Just check if there exists a number that comes more than two times and if
            // there is a element between them.

            // As we need a palidrome subsequence of length 3. 2 length will be covered by
            // the elements that are similar and remaining will be done by any element that
            // is in between.
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j] && j - i > 1) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }
        sc.close();
    }
}