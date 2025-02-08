public class removing_stars_from_a_string {

    public static String removeStars(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));

    }
}
