
// import java.util.*;

public class check_balanced_string {
    public static boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                even += Character.getNumericValue(num.charAt(i));
            } else {
                odd += Character.getNumericValue(num.charAt(i));
            }
        }

        return odd == even;
    }

    public static void main(String[] args) {
        String num = "1234";
        System.out.println(isBalanced(num));
    }
}