// Target practice

import java.util.*;

public class _1873C {
    public static int findPoints(int i, int j) {
        if (i > 3 && i < 6) {
            if (j == 4 || j == 5) {
                return 5;
            }
        }

        if (i > 2 && i < 7) {
            if (j >= 3 && j <= 6) {
                return 4;
            }
        }

        if (i > 1 && i < 8) {
            if (j >= 2 && j <= 7) {
                return 3;
            }
        }

        if (i > 0 && i < 9) {
            if (j >= 1 && j <= 8) {
                return 2;
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str[] = new String[10];
            for (int i = 0; i < 10; i++) {
                str[i] = sc.next();
            }
            int n = 10;
            int res = 0;
            int posRow = 0;
            for (int i = 0; i < n; i++) {
                char[] ch = str[i].toCharArray();
                for (int j = 0; j < n; j++) {
                    if (ch[j] == 'X') {
                        res += findPoints(posRow, j);
                    }
                }
                posRow++;
            }

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}