// Line breaks

import java.util.*;

public class _2050A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                arr[i] = str.length();
            }

            int sum = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (sum <= m) {
                    sum += arr[i];
                    res++;
                } else {
                    break;
                }
            }

            if (sum > m) {
                res--;
                System.out.println(res--);
            } else {
                System.out.println(res);
            }

            t--;
        }
        sc.close();
    }
}