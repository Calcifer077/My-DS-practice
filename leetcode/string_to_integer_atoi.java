public class string_to_integer_atoi {
    public static int myAtoi(String s) {
        int i = 0;
        // Removing all white spaces
        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        int sign = 1;
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        long ans = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                // Creating number
                ans = ans * 10 + digit;

                // If ans have gone beyond positive number limit
                if (ans > Integer.MAX_VALUE && sign == 1) {
                    return Integer.MAX_VALUE;
                    // If ans have gone beyond negative number limit
                } else if (ans > Integer.MAX_VALUE && sign == -1)
                    return Integer.MIN_VALUE;
            } else {
                break;
            }
            i++;
        }

        return (int) (ans * sign);
    }

    public static void main(String[] args) {
        String s = "21474836471";
        System.out.println(myAtoi(s));
    }
}
