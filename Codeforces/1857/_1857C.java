// Assembly via Minimums

import java.util.*;

public class _1857C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            int size = (n * (n - 1)) / 2;

            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.print(arr[0] + " ");
            int sum = 0;
            int count = n - 1;
            for (int i = 1; i < n - 1; i++) {
                sum += count;
                System.out.print(arr[sum] + " ");
                count--;
            }
            System.out.print(1000000000);
            System.out.println();

            t--;
        }
        sc.close();
    }
}