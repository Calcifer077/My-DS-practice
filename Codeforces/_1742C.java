// Stripes

import java.util.*;

public class _1742C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int row = 8;
            int col = 8;

            String str[] = new String[row];
            for (int i = 0; i < row; i++) {
                str[i] = sc.next();
            }

            int red[] = new int[row];
            for (int i = 0; i < row; i++) {
                char ch[] = str[i].toCharArray();
                for (int j = 0; j < col; j++) {
                    if (ch[j] == 'R') {
                        red[i]++;
                    }
                }
            }

            boolean res = false;
            for (int i = 0; i < row; i++) {
                if (red[i] == 8) {
                    res = true;
                }
            }
            if (res) {
                System.out.println("R");
            } else {
                System.out.println("B");
            }
            t--;
        }
        sc.close();
    }
}