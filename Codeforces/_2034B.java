// Rakhsh's Revival

import java.util.*;

public class _2034B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            String str = sc.next();
            char ch[] = str.toCharArray();

            int zeroCount = 0;
            int res = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '0') {
                    zeroCount++;
                } else {
                    zeroCount = 0;
                }

                if (zeroCount == m) {
                    res++;
                    zeroCount = 0;
                    if (k > 1) {
                        i += k - 1;
                    }
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}