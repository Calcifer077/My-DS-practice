
import java.util.*;

public class first_letter_to_appear_twice {
    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.get(ch) == 2) {
                return ch;
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        String s = "abcdd";
        System.out.println(repeatedCharacter(s));
    }
}
