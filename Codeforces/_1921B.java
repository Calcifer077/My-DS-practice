// Arranging cats

import java.util.*;

public class _1921B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();

            // 'rmv' is the operation when a cat is removed from string1 and added to
            // string2
            // 'add' is the operation when a cat is not present in strign1 and present in
            // string2.

            // Number of move operations will be equal to min of 'add' and 'rmv'.
            // When you move some cats the number of cats that you have to remove will be
            // equal to Math.abs( add- rmv). Sum of these two will be equal to max(add, rmv)

            // max(add, rmv) = min(rmv, add) + abs(rmv - add)

            int rmv = 0;
            int add = 0;
            for (int i = 0; i < n; i++) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);

                if (ch1 == '1' && ch2 == '0')
                    rmv++;

                if (ch1 == '0' && ch2 == '1')
                    add++;
            }

            System.out.println(Math.max(add, rmv));
            t--;
        }
        sc.close();
    }
}