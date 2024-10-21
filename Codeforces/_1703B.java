// ICPC ballons

import java.util.*;

public class _1703B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[26];
            String str = sc.next();

            int res = 0;
            for (int i = 0; i < n; i++) {
                if (arr[str.charAt(i) - 65] == 0) {
                    res += 2;
                    arr[str.charAt(i) - 65]++;
                } else {
                    res += 1;
                    arr[str.charAt(i) - 65]++;
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}