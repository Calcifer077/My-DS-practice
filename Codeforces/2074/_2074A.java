// Draw a square

import java.util.*;

public class _2074A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a != b || a != c || a != d || b != c || b != d || b != a || c != d || c != a || c != b || d != a) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}