// Oath of the Night's Watch

import java.util.*;

public class _768A {
    public static void main(String[] args) {
        // We have to find number of elements who have atleast one element greater than
        // them and atleast one element less than them.
        // Smallest and largest element in the array can't participate in this process
        // so we will take all the elements in between them.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[n - 1];

        int minNo = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                minNo = i;
            } else {
                break;
            }
        }

        int maxNo = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == max) {
                maxNo = i;
            } else {
                break;
            }
        }

        if (max == min) {
            System.out.println(0);
        } else {
            System.out.println(maxNo - minNo - 1);
        }

        sc.close();
    }
}