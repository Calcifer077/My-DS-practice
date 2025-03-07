// Vlad and shapes

import java.util.*;

public class _1926B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str[] = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }

            int pos = -1;
            for (int i = 0; i < n; i++) {
                char[] ch = str[i].toCharArray();
                for (int j = 0; j < n; j++) {
                    if (ch[j] == '1') {
                        pos = i;
                        break;
                    }
                }
                if (pos == i) {
                    break;
                }
            }

            int row1 = 0;
            int row2 = 0;
            if (pos < n - 1) {
                char[] ch1 = str[pos].toCharArray();
                char[] ch2 = str[pos + 1].toCharArray();
                for (int i = 0; i < n; i++) {
                    if (ch1[i] == '1') {
                        row1++;
                    }
                    if (ch2[i] == '1') {
                        row2++;
                    }
                }
            }

            if (row1 == row2) {
                System.out.println("SQUARE");
            } else {
                System.out.println("TRIANGLE");
            }
            t--;
        }
        sc.close();
    }
}