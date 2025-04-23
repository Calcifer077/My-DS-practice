// Notepad#

import java.util.*;

public class _1766B {

    public static boolean check(StringBuilder s1, StringBuilder s2) {
        String s = s1.toString();
        String t = s2.toString();

        return s.contains(t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (s.length() < 3) {
                System.out.println("NO");
            } else {
                StringBuilder toCheck = new StringBuilder();
                toCheck.append(s.charAt(0));
                toCheck.append(s.charAt(1));

                StringBuilder curr = new StringBuilder();
                curr.append(s.charAt(2));

                boolean flag = false;
                for (int i = 3; i < n; i++) {
                    char c = s.charAt(i);
                    curr.append(c);

                    if (check(toCheck, curr)) {
                        flag = true;
                        break;
                    } else {
                        toCheck.append(curr.charAt(0));
                        curr.deleteCharAt(0);
                    }
                }

                if (flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}