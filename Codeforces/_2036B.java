// Startup

import java.util.*;

public class _2036B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int brand[] = new int[k + 1];
            for (int i = 0; i < k; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();

                brand[b - 1] += c;
            }

            Arrays.sort(brand);

            int res = 0;
            for (int i = brand.length - 1; i >= 0; i--) {
                if (n > 0) {
                    res += brand[i];
                    n--;
                }
            }

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}