// Decoding

import java.util.*;

public class _746B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 1; i -= 2) {
            sb.append(ch[i]);
            ch[i] = '1';
        }

        for (int i = 0; i < n; i++) {
            if (ch[i] != '1') {
                sb.append(ch[i]);
            }
        }

        System.out.println(sb.reverse());

        sc.close();
    }
}