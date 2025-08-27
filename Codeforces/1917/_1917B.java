// Erase First or Second Letter

import java.util.*;

public class _1917B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Character> set = new HashSet<>();
            String s = sc.next();

            long count = 0;
            for (char c : s.toCharArray()) {
                set.add(c);
                count += set.size();
            }

            System.out.println(count);
        }
        sc.close();
    }
}