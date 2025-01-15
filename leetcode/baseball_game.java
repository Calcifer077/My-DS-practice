package leetcode;

import java.util.*;

public class baseball_game {
    public static int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String ch = operations[i];
            if (ch.equals("C")) {
                if (!st.empty()) {
                    st.pop();
                }
                continue;
            } else if (ch.equals("D")) {
                if (!st.empty()) {
                    st.push(2 * st.peek());
                }
                continue;
            } else if (ch.equals("+")) {
                if (!st.empty()) {
                    int a = st.pop();
                    if (!st.empty()) {
                        int b = a + st.peek();
                        st.push(a);
                        st.push(b);
                    }
                }
                continue;
            } else {
                int k = Integer.valueOf(ch);
                st.push(k);
            }
        }

        while (!st.empty()) {
            res += st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        String operations[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println(calPoints(operations));
    }

}
