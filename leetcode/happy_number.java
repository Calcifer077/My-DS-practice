package leetcode;

import java.util.*;

public class happy_number {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        for (int i = 1; i <= 9; i++) {
            set.add((int) Math.pow(10, i));
        }

        while (n > 9) {
            if (set.contains(n))
                return true;

            long temp = n;
            n = 0;
            while (temp > 0) {
                long a = temp % 10;
                temp = temp / 10;

                n += Math.pow(a, 2);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
