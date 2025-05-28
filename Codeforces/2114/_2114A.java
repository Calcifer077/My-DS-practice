// Square Year

import java.util.*;

public class _2114A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            double a = Integer.parseInt(s);

            if (a == 0) {
                System.out.println(0 + " " + 0);
            } else if (Math.sqrt(a) == (int) (Math.sqrt(a))) {
                int b = (int) Math.sqrt(a);
                System.out.println(1 + " " + (b - 1));
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
