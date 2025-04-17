// Tung Tung Sahur

import java.util.*;

public class _2094D {
    public static long count(String s, int start, char c) {
        long count = 0;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                return count;
            } else {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String p = sc.next();

            if (s.length() == p.length()) {
                if (s.equals(p)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (p.length() < s.length() || p.length() > 2 * s.length()) {
                System.out.println("NO");
            } else {
                long size1 = s.length();
                long size2 = p.length();
                int start1 = 0;
                int start2 = 0;

                boolean flag = true;

                long globalCount = 0;

                while (start1 < size1 && start2 < size2) {
                    if (s.charAt(start1) != p.charAt(start2)) {
                        flag = false;
                        break;
                    }

                    long count1 = count(s, start1, s.charAt(start1));
                    long count2 = count(p, start2, p.charAt(start2));

                    globalCount += count1;
                    globalCount += count2;

                    // System.out.println(count1 + " " + count2 + " " + s.charAt(start1) + " " +
                    // p.charAt(start2));

                    if (count2 < count1 || count2 > 2 * count1) {
                        // System.out.println("one");
                        flag = false;
                        break;
                    } else {
                        start1 += count1;
                        start2 += count2;
                    }
                }

                // System.out.println(globalCount);

                if (flag && globalCount == (size1 + size2)) {
                    System.out.println("YES");
                } else {
                    // System.out.println("two");
                    System.out.println("NO");
                }

            }
        }
        sc.close();
    }
}

// LLRLRLRRL
// LLLRLRRLLRRRL