// Above the clouds

import java.util.*;

public class _2121B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = false;

            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(0));

            for (int i = 1; i < n - 1; i++) {
                if (set.contains(s.charAt(i))) {
                    flag = true;
                    break;
                }

                set.add(s.charAt(i));
            }

            set.clear();
            set.add(s.charAt(n - 1));

            for (int i = n - 2; i > 0; i--) {
                if (set.contains(s.charAt(i))) {
                    flag = true;
                    break;
                }

                set.add(s.charAt(i));
            }

            if (flag) {
                System.out.println("YES");
            } else {

                System.out.println("NO");

            }

        }
        sc.close();
    }
}