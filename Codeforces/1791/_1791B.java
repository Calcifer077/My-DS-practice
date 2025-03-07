// Following Directions

import java.util.*;

public class _1791B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int x = 0;
            int y = 0;

            boolean passesby = false;

            for (int k = 0; k < n; k++) {
                if (str.charAt(k) == 'L') {
                    x--;
                } else if (str.charAt(k) == 'R') {
                    x++;
                } else if (str.charAt(k) == 'U') {
                    y++;
                } else if (str.charAt(k) == 'D') {
                    y--;
                }

                if (x == 1 && y == 1) {
                    passesby = true;
                    break;
                }
            }

            if (passesby) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}