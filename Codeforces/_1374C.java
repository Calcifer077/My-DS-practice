// Move brackets

import java.util.*;

public class _1374C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> st = new Stack<>();

            // Only count the number of openining brackets that don't have a corresponding
            // closing bracket with them.
            // Because these are the one which we need to move to make balance brackets.
            int open = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (ch == ')') {
                    if (!st.empty()) {
                        if (st.peek() == '(') {
                            st.pop();
                            continue;
                        }
                    }
                }

                st.push(ch);
            }

            // Only count number of opening brackets.
            while (!st.empty()) {
                if (st.pop() == ')') {
                    open++;
                }
            }

            System.out.println(open);

            t--;
        }
        sc.close();
    }
}