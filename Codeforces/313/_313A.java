// Ilya and Bank Account

import java.util.*;

public class _313A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char ch[] = s.toCharArray();

        if (ch[0] == '-') {
            int a = Character.getNumericValue(ch[ch.length - 1]);
            int b = Character.getNumericValue(ch[ch.length - 2]);

            if (b > a) {
                ch[ch.length - 2] = '-';
            } else {
                ch[ch.length - 1] = '-';
            }

            StringBuilder sb = new StringBuilder();

            sb.append('-');
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] != '-') {
                    sb.append(ch[i]);
                }
            }

            if (sb.length() == 2 && sb.charAt(1) == '0') {
                System.out.println(0);
            } else {
                System.out.println(sb);
            }

        } else {
            System.out.println(s);
        }

        sc.close();
    }
}