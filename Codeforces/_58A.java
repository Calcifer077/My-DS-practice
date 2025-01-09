// chat room

import java.util.*;

public class _58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char ch[] = { 'h', 'e', 'l', 'l', 'o' };
        int j = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch[j]) {
                count++;
                if (j < ch.length - 1) {
                    j++;
                } else {
                    break;
                }
            }
        }

        if (count == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}