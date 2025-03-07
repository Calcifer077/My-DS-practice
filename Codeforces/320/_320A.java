// Magic Numbers

import java.util.*;

public class _320A {

    public static void solve(String s) {
        if (s.charAt(0) != '1') {
            System.out.println("NO");
            return;
        }

        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count = 0;
                continue;
            } else if (s.charAt(i) == '4') {
                count++;
            } else {
                System.out.println("NO");
                return;
            }

            if (count > 2) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        solve(s);
        sc.close();
    }
}