// Helmets in Night Light

import java.util.*;

public class _1876A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arr[i][1] = sc.nextInt();
            }

            long res = 0;
            long inf = 0;

            Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

            int i = 0;

            res += k;
            inf++;
            while (inf < n) {
                int a = arr[i][0];
                int b = arr[i][1];

                if (b >= k) {
                    res += k;
                    inf++;
                } else {
                    while (a > 0 && inf < n) {
                        res += b;
                        a -= 1;
                        inf++;
                    }
                    i++;
                }

            }

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}