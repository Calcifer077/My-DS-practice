// Skibidus and Ohio

import java.util.*;

public class _2065B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();

            boolean flag = false;

            // If you can match two consecutive characters then you can change them to such
            // that it will reduce whole array to 1.
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(1);
            } else {
                System.out.println(s.length());
            }
            t--;
        }
        sc.close();
    }
}