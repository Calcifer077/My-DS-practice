// ABBB

import java.util.*;

public class _1428C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            Stack<Character> st = new Stack<>();
            for (char c : s.toCharArray()) {
                if (st.isEmpty())
                    st.push(c);
                else {
                    if (c == 'B') {
                        if (st.peek() == 'A' || st.peek() == 'B') {
                            st.pop();
                        }
                    } else {
                        st.push(c);
                    }
                }
            }

            System.out.println(st.size());
        }
        sc.close();
    }
}