// Make majority

import java.util.*;

public class _1988B {
    public static void solve(int n, String s) {
        if (n == 1) {
            if (s.charAt(0) == '0') {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            return;
        }

        if (s.charAt(0) == '1' && s.charAt(n - 1) == '1') {
            System.out.println("Yes");
        } else {
            int max = 0;
            int count = 0;
            int countForTwo = 0;
            int a = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    count++;
                    countForTwo++;
                    if (countForTwo >= 2) {
                        countForTwo = 0;
                        a++;
                    }
                } else {
                    max = Math.max(max, count);
                    count = 0;
                    countForTwo = 0;

                    if (max > 2) {
                        break;
                    }
                }
            }

            max = Math.max(max, count);

            // If anywhere in the string there is a string that have a substring that
            // contains 1 more than 3 times, then we can form majority.
            if (max > 2) {
                System.out.println("Yes");
            } else if (max >= 2 && (s.charAt(0) == '1' || s.charAt(n - 1) == '1')) {
                System.out.println("Yes");
            } else if (a >= 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            solve(n, s);
            t--;
        }
        sc.close();
    }
}