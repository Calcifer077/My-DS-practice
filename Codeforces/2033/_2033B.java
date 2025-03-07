// Sakurako and water

import java.util.*;

public class _2033B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int map[][] = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // int sum = 0;
            // for (int i = n - 1; i >= 0; i--) {
            // int min = 0;
            // for (int j = 0; j < n; j++) {
            // if (Math.abs(i - j) == i && map[i][j] < 0) {
            // // System.out.println(i + " -- " + j);
            // // System.out.println(map[i][j]);
            // min = Math.min(map[i][j], min);
            // }
            // }
            // if (min < 0) {
            // sum += Math.abs(min);
            // }
            // }

            // for (int i = 0; i < n; i++) {
            // int min = 0;
            // for (int j = 1; j < n; j++) {
            // if (j - i == i && map[i][j] < 0) {
            // // System.out.println(i + " -- " + j);
            // // System.out.println(map[i][j]);
            // min = Math.min(map[i][j], min);
            // sum += Math.abs(min);
            // }
            // }

            // if (min < 0) {
            // sum += Math.abs(min);
            // }
            // }

            int sum = 0;
            int i = n - 1;
            while (i >= 0) {
                int j = i;
                int k = 0;
                int min = 0;
                for (j = i, k = 0; j < n && k < n; j++, k++) {
                    // System.out.println(map[j][k]);
                    min = Math.min(map[j][k], min);
                }

                sum += Math.abs(min);

                i--;
            }

            i = 0;
            while (i < n) {
                int j = 0;
                int k = i + 1;

                int min = 0;
                for (j = 0, k = i + 1; j < n && k < n; j++, k++) {
                    // System.out.println(map[j][k]);
                    min = Math.min(map[j][k], min);
                }

                sum += Math.abs(min);
                i++;
            }

            System.out.println(sum);
            t--;
        }
        sc.close();
    }
}