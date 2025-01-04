// Olya and Game with Arrays

import java.util.*;

public class _1859B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[][] arrays = new int[n][];

            long res = 0;
            int min = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                arrays[i] = new int[m];

                for (int j = 0; j < m; j++) {
                    arrays[i][j] = sc.nextInt();
                }
                Arrays.sort(arrays[i]);

                res += arrays[i][1];
                min = Math.min(min, arrays[i][0]);
                secondMin = Math.min(secondMin, arrays[i][1]);
            }

            res = res - secondMin + min;
            System.out.println(res);

            t--;
        }
        sc.close();
    }
}