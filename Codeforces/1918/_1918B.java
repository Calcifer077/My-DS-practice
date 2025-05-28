// Minimize Inversions

import java.util.*;

public class _1918B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[][] = new int[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arr[i][1] = sc.nextInt();
            }

            Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][1] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}