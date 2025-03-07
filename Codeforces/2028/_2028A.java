// Alice's Adventures in "Chess"

import java.util.*;

public class _2028A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            String str = sc.next();

            int x = 0;
            int y = 0;

            boolean meet = false;

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < n; j++) {
                    if (x == a && y == b) {
                        meet = true;
                        break;
                    }
                    if (str.charAt(j) == 'N') {
                        y++;
                    } else if (str.charAt(j) == 'E') {
                        x++;
                    } else if (str.charAt(j) == 'W') {
                        x--;
                    } else if (str.charAt(j) == 'S') {
                        y--;
                    }
                }

            }
            System.out.println(meet ? "YES" : "NO");
            t--;
        }
        sc.close();
    }
}