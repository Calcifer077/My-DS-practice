// Vanya and Lanterns

import java.util.*;

public class _492B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        // There will be three cases.
        // We need to light from the first light to 0.
        // We need to light from last light to l.
        // We need to light somewhere in between, When we are considering between there
        // are two lights at work so that distance will be divided by two.

        // in front of first light
        double max1 = arr[0] - 0;
        double max = max1;
        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i] - arr[i - 1], max);
        }

        // Somewhere in between
        double max2 = max / 2;

        // After last light
        double max3 = l - arr[n - 1];

        if (max1 >= max2 && max1 >= max3) {
            System.out.println(max1);
        } else if (max3 >= max2 && max3 >= max1) {
            System.out.println(max3);
        } else {
            System.out.println(max2);
        }
        sc.close();
    }
}