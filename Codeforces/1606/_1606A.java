// AB balance

import java.util.*;

public class _1606A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            System.out.println(s.charAt(n - 1) + s.substring(1));
        }
        sc.close();
    }
}