// Sum of digits

import java.util.*;

public class _102B {
    public static int solve(String s) {
        StringBuilder sb = new StringBuilder(s);

        int count = 0;
        while (sb.length() > 1) {
            long a = 0;
            for (int i = 0; i < sb.length(); i++) {
                a += Character.getNumericValue(sb.charAt(i));
            }

            // Basically emptying the string
            sb.setLength(0);
            sb.append(Long.toString(a));
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solve(s));
        sc.close();
    }
}