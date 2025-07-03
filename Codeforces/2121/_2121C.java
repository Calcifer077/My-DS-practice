// Those Who Are With Us

import java.util.*;

public class _2121C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // The answer only depends on the largest element say 'max'.
            // Answer will be 'max - 1' if 'max' only occurs in a certain pair of row and
            // column else the answer will be 'max'.
            // To check this try out all pairs of row and columns.

            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr[][] = new int[n][m];

            int max = Integer.MIN_VALUE;
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();

                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        count = 1;
                    } else if (arr[i][j] == max) {
                        count++;
                    }
                }
            }

            int[] row = new int[n];
            int[] col = new int[m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == max) {
                        row[i]++;
                        col[j]++;
                    }
                }
            }

            int flag = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // Subtracting one or zero because there can be a case when 'max' is repeating
                    // for a cell. And this cell will be responsible for incrementing both 'row'
                    // array and 'col' array.
                    if (row[i] + col[j] - (arr[i][j] == max ? 1 : 0) == count) {
                        flag = 1;
                    }
                }
            }

            System.out.println(max - flag);
        }
        sc.close();
    }
}