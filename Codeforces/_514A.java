// Chewbaсca and Number

import java.util.*;

public class _514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        boolean first = false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // As it is asked in the question that the first number can't be zero and
            // inverse of 9 is 0, so if it is at the first place don't attach its inverse
            // rather the number itself.
            if (c == '9' && !first) {
                sb.append(c);
                first = true;
                continue;
            } else {
                first = true;
            }

            int a = Character.getNumericValue(c);
            if (a < 5) {
                sb.append(c);
            } else {
                sb.append(9 - a);
            }
        }

        System.out.println(sb);
        sc.close();
    }
}