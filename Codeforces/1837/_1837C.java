// Best Binary String

import java.util.*;

public class _1837C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            StringBuilder sb = new StringBuilder();
            if (s.charAt(0) == '?') {
                sb.append('0');
            } else {
                sb.append(s.charAt(0));
            }

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '?') {
                    if (sb.charAt(i - 1) == '0') {
                        sb.append('0');
                    } else {
                        sb.append('1');
                    }
                } else {
                    sb.append(s.charAt(i));
                }
            }

            System.out.println(sb);
        }
        sc.close();
    }
}