import java.util.*;

public class find_all_anagrams_in_a_string {
    public static List<Integer> findAnagrams(String s, String p) {
        // Brute Force

        /*
         * 
         * // 'p' is the string of which we have to find anagrams in 's'
         * List<Integer> res = new ArrayList<>();
         * 
         * int pL = p.length();
         * int sL = s.length();
         * 
         * // If 'p' length is more than 's' then there is no way that any anagram can
         * // exist, that's why we are returing a empty list.
         * if (pL > sL) {
         * return res;
         * }
         * 
         * // Creating a frequency array for 'p'.
         * int freq1[] = new int[26];
         * for (int i = 0; i < pL; i++) {
         * freq1[p.charAt(i) - 'a']++;
         * }
         * 
         * // Why start and end. Because you need at least pL characters to check if a
         * // anagram even exists.
         * int start = 0;
         * int end = pL - 1;
         * while (end < sL) {
         * StringBuilder sb = new StringBuilder();
         * for (int j = start; j <= end; j++) {
         * sb.append(s.charAt(j));
         * }
         * 
         * if (isAnagram(freq1, sb)) {
         * res.add(start);
         * }
         * 
         * start++;
         * end++;
         * }
         * 
         * return res;
         */

        List<Integer> res = new ArrayList<>();

        int pL = p.length();
        int sL = s.length();

        if (pL > sL) {
            return res;
        }

        int pCount[] = new int[26];
        int sCount[] = new int[26];
        for (int i = 0; i < pL; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount))
            res.add(0);

        for (int i = pL; i < sL; i++) {
            // This code goes from window to window. Whenever there is a introduction of a
            // new character its frequency is increased and simultaneously the character
            // which just left the window is removed.

            sCount[s.charAt(i) - 'a']++; // Add new character to the window
            sCount[s.charAt(i - pL) - 'a']--; // Remove old character

            if (Arrays.equals(sCount, pCount)) {
                res.add(i - pL + 1);
            }
        }

        return res;
    }

    /*
     * 
     * public static boolean isAnagram(int freq[], StringBuilder s) {
     * int f[] = new int[26];
     * int n = s.length();
     * for (int i = 0; i < n; i++) {
     * f[s.charAt(i) - 'a']++;
     * }
     * 
     * for (int i = 0; i < 26; i++) {
     * if (f[i] != freq[i]) {
     * return false;
     * }
     * }
     * 
     * return true;
     * }
     */

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}
