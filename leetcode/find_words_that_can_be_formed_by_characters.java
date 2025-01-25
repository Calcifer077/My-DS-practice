package leetcode;

import java.util.HashMap;

public class find_words_that_can_be_formed_by_characters {
    public static int countCharacters(String[] words, String chars) {
        int res = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char ch1 = words[i].charAt(j);
                map2.put(ch1, map2.getOrDefault(ch1, 0) + 1);
            }

            boolean flag = true;
            for (char ch2 : map2.keySet()) {
                if (map1.containsKey(ch2)) {
                    if (map1.get(ch2) >= map2.get(ch2)) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(words[i]);
                res += words[i].length();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String words[] = { "cat", "bt", "hat", "tree" };
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
}
