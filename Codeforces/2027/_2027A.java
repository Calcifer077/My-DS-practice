// Rectangle arrangement

import java.util.*;

public class _2027A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int maxRow = 0;
            int maxCol = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                maxRow = Math.max(maxRow, a);
                maxCol = Math.max(maxCol, b);
            }

            System.out.println(2 * (maxRow + maxCol));
            t--;
        }
        sc.close();
    }
}