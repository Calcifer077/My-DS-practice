// Twins

import java.util.*;

public class _160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);
        int count = 0;
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            count += arr[i];
            j++;
            if (count > sum / 2) {
                break;
            }
        }

        System.out.println(j);
        sc.close();
    }
}