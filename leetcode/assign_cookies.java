package leetcode;

import java.util.*;

public class assign_cookies {
    public static int solve(int g[], int s[]) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int g[] = { 10, 9, 8, 7 };
        int s[] = { 5, 6, 7, 8 };
        System.out.println(solve(g, s));
    }
}
