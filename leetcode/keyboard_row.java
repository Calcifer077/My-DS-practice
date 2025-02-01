
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class keyboard_row {
    public static String[] findWords(String[] words) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Character> set1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        HashSet<Character> set2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        HashSet<Character> set3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        for (int i = 0; i < words.length; i++) {
            String str = words[i].toLowerCase();
            if (set1.contains(str.charAt(0))) {
                boolean flag = true;
                for (int j = 1; j < str.length(); j++) {
                    if (!set1.contains(str.charAt(j))) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    res.add(i);
                }
            } else if (set2.contains(str.charAt(0))) {
                boolean flag = true;
                for (int j = 1; j < str.length(); j++) {
                    if (!set2.contains(str.charAt(j))) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    res.add(i);
                }
            } else if (set3.contains(str.charAt(0))) {
                boolean flag = true;
                for (int j = 1; j < str.length(); j++) {
                    if (!set3.contains(str.charAt(j))) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    res.add(i);
                }
            }
        }

        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = words[res.get(i)];
            System.out.println(words[res.get(i)]);
        }

        return ans;
    }

    public static void main(String[] args) {
        String words[] = { "Hello", "Alaska", "Dad", "Peace" };
        System.out.println(findWords(words));
    }

}
