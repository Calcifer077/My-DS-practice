package leetcode;

import java.util.HashMap;

public class word_pattern {
    // The concept in this question is similar to the one in isomorphics strings.
    public static boolean wordPattern(String pattern, String s) {
        // Creating a array of strings around a space.
        String arr[] = s.split(" ");

        if (pattern.length() != arr.length) {
            System.out.println(1);
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = arr[i];

            if (map1.containsKey(ch)) {
                if (map1.get(ch).equals(str) == false) {
                    return false;
                }
            } else {
                map1.put(ch, str);
            }

            if (map2.containsKey(str)) {
                if (map2.get(str) != ch) {
                    return false;
                }
            } else {
                map2.put(str, ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }
}
