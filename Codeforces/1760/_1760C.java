// Advantage

import java.util.*;

public class _1760C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            int max = 0;
            int secondMax = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] == max) {
                    secondMax = max;
                }

                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                }

                if (arr[i] > secondMax && arr[i] < max) {
                    secondMax = arr[i];
                }

            }

            for (int i = 0; i < n; i++) {
                if (arr[i] == max) {
                    System.out.print(arr[i] - secondMax + " ");
                } else {
                    System.out.print(arr[i] - max + " ");
                }
            }

            System.out.println();
            t--;
        }
        sc.close();
    }
}