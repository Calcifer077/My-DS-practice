// Kana and Dragon Quest game

import java.util.*;

public class _1337B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int h = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            while (n > 0) {
                if (h <= m * 10) {
                    h = 0;
                    m = 0;
                    break;
                }

                h = (h / 2) + 10;
                n--;

                if (h <= 0) {
                    break;
                }
            }

            if (h <= m * 10) {
                h = 0;
            }

            if (h <= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}