package CodeChef;

import java.util.*;

public class minimum_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int c[] = new int[n];
            int values[] = new int[n];

            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
            }

            int coins[] = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = sc.nextInt();
                coins[i] = c[i] * values[i];
            }

            Arrays.sort(coins);

            int sum = 0;
            int res = 0;
            for (int i = values.length - 1; i >= 0; i--) {
                sum += coins[i];
                res++;
                if (sum >= x) {
                    break;
                }
            }

            if (sum >= x) {
                System.out.println(res);
            } else {
                System.out.println(-1);
            }
            t--;
        }
        sc.close();
    }
}