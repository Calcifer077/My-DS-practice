package leetcode;

import java.util.HashMap;

public class friends_of_appropriate_ages {
    public static boolean canBeFriend(int a, int b) {
        if (b <= 0.5 * a + 7 || b > a || b > 100 && a < 100) {
            return false;
        }
        return true;
    }

    public static int numFriendRequests(int[] ages) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ages.length; i++) {
            map.put(ages[i], map.getOrDefault(ages[i], 0) + 1);
        }

        for (int i : map.keySet()) {
            for (int j : map.keySet()) {
                if (canBeFriend(i, j)) {
                    // If 'a' can make friend 'b', suppose if 'b' is more than one time, then 'a'
                    // can make friend will all of them. It will work other way around too.
                    // Why are we checking 'i' == 'j'. If 'i' == 'j' then according to condition one
                    // can't make friend with itself, that's why we are subtracting one from it.
                    res += map.get(i) * (map.get(j) - (i == j ? 1 : 0));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int ages[] = { 20, 30, 100, 110, 120 };
        System.out.println(numFriendRequests(ages));
    }
}
