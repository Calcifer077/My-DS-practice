// YetnotherrokenKeoard

import java.util.*;

public class _1907B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            // Will use two stacks one for uppercase and another for lowercase.

            // They will store indexes of characters of uppercase and lowercase
            // respectively.

            // What we will do is whenever there is a character we want to remove we will
            // put a check at that position so we won't include it in result. In this case,
            // the check is 'B' or 'b'.

            // For uppercase
            Stack<Integer> st1 = new Stack<>();
            // For lowercase
            Stack<Integer> st2 = new Stack<>();

            int n = s.length();
            char c[] = s.toCharArray();

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch >= 65 && ch <= 90) {
                    if (ch == 'B' && st1.size() > 0) {
                        c[st1.pop()] = 'b';
                    } else {
                        st1.push(i);
                    }
                } else {
                    if (ch == 'b' && st2.size() > 0) {
                        c[st2.pop()] = 'b';
                    } else {
                        st2.push(i);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c.length; i++) {
                if (c[i] != 'b' && c[i] != 'B') {
                    sb.append(c[i]);
                }
            }
            System.out.println(sb);
            t--;
        }
        sc.close();
    }
}