// Dominant Piranha

import java.util.*;

public class _1433C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // We just have to check immediate neigbors of maximum piranha. If this piranha
            // is greater than one of its neigbhor then this is our answer.
            int maxSize = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                maxSize = Math.max(maxSize, arr[i]);
            }

            int result = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == maxSize) {
                    // Check left and right neighbors
                    if ((i > 0 && arr[i - 1] < maxSize) || (i < n - 1 && arr[i + 1] < maxSize)) {
                        result = i + 1; // Convert 0-based to 1-based index
                        break;
                    }
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}
