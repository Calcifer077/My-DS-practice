// Ten words of wisdom

import java.util.*;

public class _1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int highQuality = 0;
            int res = -1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a <= 10 && b > highQuality) {
                    highQuality = b;
                    res = i + 1;
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}