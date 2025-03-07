// Short sort

import java.util.*;

public class _1873A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            int res = 0;
            if (str.charAt(0) != 'a') {
                res++;
            }
            if (str.charAt(1) != 'b') {
                res++;
            }
            if (str.charAt(2) != 'c') {
                res++;
            }

            if (res == 2 || res == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}