package leetcode;

import java.util.HashMap;

public class rearrange_characters_to_make_target_string {
    public static int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> a = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            a.put(ch, a.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        int max = 0;
        while (true) {
            boolean flag = true;
            for (int i = 0; i < target.length(); i++) {
                char ch = target.charAt(i);

                if (a.containsKey(ch)) {
                    if (a.get(ch) > 0) {
                        count++;
                        a.put(ch, a.get(ch) - 1);
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }

                if (count == target.length()) {
                    count = 0;
                    max++;
                }
            }

            if (!flag) {
                break;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abbaccaddaeea";
        String target = "aaaaa";
        System.out.println(rearrangeCharacters(s, target));
    }
}
