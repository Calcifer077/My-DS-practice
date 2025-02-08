public class remove_outermost_parentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    res.append('(');
                }
                count++;
            }

            if (s.charAt(i) == ')') {
                count--;
                if (count > 0) {
                    res.append(')');
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
