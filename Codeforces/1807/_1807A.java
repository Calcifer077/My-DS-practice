// Plus or Minus

import java.util.*;

public class _1807A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean plus = a + b == c;
            System.out.println(plus ? '+' : '-');
            t--;
        }
        sc.close();
    }
}