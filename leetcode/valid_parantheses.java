import java.util.*;

public class valid_parantheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                st.push(curr);
            }

            if (!st.empty()) {
                if (curr == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

                if (curr == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                }

                if (curr == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        if (st.empty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = ")";
        System.out.println(isValid(s));
    }
}
