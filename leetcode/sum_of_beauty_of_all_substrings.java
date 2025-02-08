// import java.util.*;

public class sum_of_beauty_of_all_substrings {
    public static int beautySum(String s) {
        // Brute force
        /*
         * 
         * int res = 0;
         * 
         * int n = s.length();
         * 
         * char ch[] = s.toCharArray();
         * 
         * for (int i = 0; i < n; i++) {
         * for (int j = i; j < n; j++) {
         * // Creating substring
         * StringBuilder sb = new StringBuilder();
         * for (int k = i; k <= j; k++) {
         * sb.append(ch[k]);
         * }
         * 
         * res += calcBeauty(sb.toString());
         * }
         * }
         * 
         * return res;
         */

        int n = s.length();
        if (n == 1) {
            return 0;
        }

        int res = 0;
        // will traverse all string
        for (int i = 0; i < n; i++) {
            int freq[] = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int c : freq) {
                if (c > 0) {
                    max = Math.max(max, c);
                    min = Math.min(min, c);
                }
            }

            res += (max - min);
        }

        return res;

    }

    // Calculating beauty
    // public static int calcBeauty(String s) {

    // }

    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }
}
