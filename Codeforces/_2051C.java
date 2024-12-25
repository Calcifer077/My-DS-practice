// Preparing for the exam

import java.util.*;

public class _2051C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[m];
            int ques[] = new int[k];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < k; i++) {
                ques[i] = sc.nextInt();
            }

            boolean know[] = new boolean[n + 1];
            StringBuffer str = new StringBuffer();

            for (int i = 0; i < k; i++) {
                know[ques[i]] = true;
            }

            int diff = n - k;
            for (int i = 0; i < m; i++) {
                boolean c = false;
                if (know[a[i]] && diff == 0) {
                    c = true;
                } else if (!know[a[i]] && diff == 1) {
                    c = true;

                }
                str.append(c ? '1' : '0');
            }
            System.out.println(str);
            t--;
        }
        sc.close();
    }
}