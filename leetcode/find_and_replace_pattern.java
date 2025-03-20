import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_and_replace_pattern {
    public static boolean check(char[] pattern, char[] word) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length; i++) {
            if (map1.containsKey(pattern[i])) {
                if (map1.get(pattern[i]) != word[i]) {
                    return false;
                }
            } else {
                map1.put(pattern[i], word[i]);
            }

            if (map2.containsKey(word[i])) {
                if (map2.get(word[i]) != pattern[i]) {
                    return false;
                }
            } else {
                map2.put(word[i], pattern[i]);
            }
        }

        return true;
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        // Using the same concept of isomorphic string
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != pattern.length()) {
                continue;
            }

            if (check(pattern.toCharArray(), words[i].toCharArray())) {
                res.add(words[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String words[] = { "abc", "deq", "mee", "aqq", "dkd", "ccc" };
        String patteString = "abb";
        System.out.println(findAndReplacePattern(words, patteString));
    }
}
