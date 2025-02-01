// cAPS LOCK

import java.util.*;

public class _131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.length() == 1) {
            if (s.charAt(0) == Character.toUpperCase(s.charAt(0))) {
                System.out.print(Character.toLowerCase(s.charAt(0)));
            } else {
                System.out.print(Character.toUpperCase(s.charAt(0)));
            }
        } else {
            boolean all = true;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != Character.toUpperCase(s.charAt(i))) {
                    all = false;
                }
            }

            for (char c : s.toCharArray()) {
                if (all) {
                    if (c == Character.toUpperCase(c)) {
                        System.out.print(Character.toLowerCase(c));
                    } else {
                        System.out.print(Character.toUpperCase(c));
                    }
                } else {
                    System.out.print(c);
                }
            }
        }

        System.out.println();
        sc.close();
    }
}