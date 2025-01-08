package leetcode;

import java.util.ArrayList;

public class reverse_words_in_a_string {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();

        int end = s.length() - 1;

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }

            if (end < 0) {
                break;
            }

            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            for (int i = start + 1; i <= end; i++) {
                res.append(s.charAt(i));
            }
            res.append(' ');
            end = start - 1;
        }

        return res.length() > 0 ? res.substring(0, res.length() - 1) : "";
    }

    public static void main(String[] args) {
        // String s = " hello world ";
        String s = "a good    example ";
        // String s = " a ";
        // System.out.println(s.substring(0, s.length()));
        System.out.println(reverseWords(s));
    }
}
