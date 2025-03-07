// Business Trip

import java.util.*;

public class _149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[12];

        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        int pos = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];

            // Stop when the plant have grown just past the requirement.
            if (sum >= n) {
                pos = i;
                break;
            }
        }

        // If 'n' is 0 means that parents don't except the plant to grow so answer will
        // be 0.
        if (n == 0) {
            System.out.println(0);

            // If 'pos' == -1 meaning that we weren't able to achieve our goal.
        } else if (pos == -1) {
            System.out.println(-1);
        } else {
            System.out.println(arr.length - pos);
        }
        sc.close();
    }
}