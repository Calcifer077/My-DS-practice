// Present from Lena

import java.util.*;

public class _118B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = (2 * n) + 1;
        int res[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = -1;
            }
        }

        // Forming the result
        int start = n;

        // Forming the upper half
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int curr = start;
            while (curr < n) {
                res[i][curr] = count;
                count++;
                curr++;
            }

            // System.out.println(curr + " " + start);
            while (curr < size - start) {
                res[i][curr] = count;
                count--;
                curr++;
            }

            start--;
        }

        // Forming the lower half
        for (int i = n + 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = res[size - i - 1][j];

            }
        }

        // Printing the result
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            boolean isFirstNonNegative = false;
            for (int j = 0; j < size; j++) {
                if (res[i][j] == -1) {
                    if (isFirstNonNegative) {
                        break;
                    }
                    sb.append(" ");
                    sb.append(" ");
                } else {
                    isFirstNonNegative = true;
                    sb.append(res[i][j]);
                    sb.append(" ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }
        sc.close();
    }
}