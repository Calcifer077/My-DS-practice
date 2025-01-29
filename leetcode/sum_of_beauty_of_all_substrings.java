package leetcode;

import java.util.*;

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

        int ans = 0;

        int n = s.length();

        // In below approach we will calculate frequency for each substring.
        for (int i = 0; i < n; i++) {

            // Using a array because string only contians of lowercase english letters.
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                // Iterating through the frequency map to calculate beauty.
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }

                ans += max - min;
            }
        }

        return ans;
    }

    // Calculating beauty
    public static int calcBeauty(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char c : map.keySet()) {
            max = Math.max(map.get(c), max);
            min = Math.min(map.get(c), min);
        }

        return (max - min);
    }

    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }
}
