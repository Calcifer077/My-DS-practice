import java.util.*;

public class longest_substring_without_repeating_characters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int n = s.length();
        if (n == 1) {
            return 1;
        }

        int start = 0;
        int end = 1;
        set.add(s.charAt(start));
        int max = 0;
        int count = 1;
        while (start <= end && end < n) {
            char c = s.charAt(end);
            if (set.contains(c)) {
                System.out.println(c);
                while (set.contains(c)) {
                    char a = s.charAt(start);
                    set.remove(a);
                    start++;
                    count--;
                }

            }
            count++;
            end++;
            set.add(c);

            max = Math.max(count, max);
        }

        // max = Math.max(max, set.size());

        return max;
    }

    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }

}