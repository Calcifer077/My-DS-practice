package leetcode;

import java.util.ArrayList;

public class rotate_string {

    public static ArrayList<Integer> search(String s, char target) {
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                pos.add(i);
            }
        }

        return pos;
    }

    public static boolean rotateString(String s, String goal) {
        ArrayList<Integer> pos = search(goal, s.charAt(0));

        if (pos.size() == 0 || s.length() != goal.length()) {
            System.out.println("1-");
            return false;
        }

        int i = 0;
        int count = 0;
        int res = 0;
        int j = pos.get(count);
        while (i < s.length()) {
            if (s.charAt(i) == goal.charAt(j)) {
                i++;
                j++;
                res++;
            } else {
                i = 0;
                count++;
                res = 0;

                if (count >= pos.size()) {
                    break;
                }

                j = pos.get(count);
            }

            if (j == goal.length()) {
                j = 0;
            }

        }

        return res == s.length();
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}
