// Only One Digit

import java.util.*;

public class _2126A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            int min = Integer.MAX_VALUE;
            for (char c : s.toCharArray()) {
                min = Math.min(min, c - '0');
            }

            System.out.println(min);
        }
        sc.close();
    }
}