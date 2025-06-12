// Down with Brackets

import java.util.*;

public class _2110B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            Stack<Character> st = new Stack<>();
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) == '(') {
                    st.push(s.charAt(i));
                } else {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        st.add(s.charAt(i));
                    }
                }
            }

            if (!st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}