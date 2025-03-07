// String task

import java.util.*;

public class _118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                continue;
            } else {
                sb.append('.');
                sb.append(c);
            }
        }

        System.out.println(sb);
        sc.close();
    }
}