// Words on the paper

import java.util.*;

public class _1850C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = 8;
            String str[] = new String[n];

            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }

            int row = 0;
            int col = 0;
            boolean found = false;
            for (int i = 0; i < n; i++) {
                char[] ch = str[i].toCharArray();
                for (int j = 0; j < n; j++) {
                    if (ch[j] != '.') {
                        row = i;
                        col = j;
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }
            }

            String res = "";
            for (int i = row; i < n; i++) {
                char[] ch = str[i].toCharArray();
                if (ch[col] == '.') {
                    break;
                } else {
                    res += ch[col];
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}