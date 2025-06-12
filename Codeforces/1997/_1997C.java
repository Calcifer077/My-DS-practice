// Even Positions

import java.util.*;

public class _1997C {
    static class Helper {
        char c;
        int pos;

        Helper(char c, int pos) {
            this.c = c;
            this.pos = pos;
        }

        public char getChar() {
            return c;
        }

        public int getPos() {
            return pos;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Helper> st = new Stack<>();
            long count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    st.push(new Helper(s.charAt(i), i));
                } else {
                    if (s.charAt(i) == '_') {
                        if (!st.isEmpty() && (st.peek().getChar() == '_' || st.peek().getChar() == '(')) {
                            count += i - st.peek().getPos();
                            st.pop();
                        } else {
                            st.push(new Helper(s.charAt(i), i));
                        }
                    } else if (s.charAt(i) == ')') {
                        // As the given brackets are regular bracket sequence we don't need to check.
                        count += i - st.peek().getPos();
                        st.pop();
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}