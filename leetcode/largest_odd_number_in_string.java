package leetcode;

public class largest_odd_number_in_string {
    public static String largestOddNumber(String num) {
        String res = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String num = "1230";
        System.out.println(largestOddNumber(num));

    }
}
