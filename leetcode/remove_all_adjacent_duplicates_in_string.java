package leetcode;

import java.util.Stack;

public class remove_all_adjacent_duplicates_in_string {
    public static String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            boolean flag = true;
            if (!st.empty()) {
                // If s.charAt(i) == s.charAt(i + 1), remove both of them.
                if (st.peek() == ch) {
                    st.pop();
                    flag = false;
                    if (res.length() > 0) {
                        res.deleteCharAt(res.length() - 1);
                    }
                }
            }

            // Only add in result if removal was not performd.
            if (flag) {
                st.push(ch);
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
