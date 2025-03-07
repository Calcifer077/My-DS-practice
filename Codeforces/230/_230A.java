// Dragons

import java.util.*;

public class _230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // Sorting matrix based on first value
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (m <= arr[i][0]) {
                flag = false;
                break;
            } else {
                m += arr[i][1];
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}