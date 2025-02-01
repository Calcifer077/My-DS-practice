
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_common_characters {
    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();

        // This is the hashmap of the first string.
        HashMap<Character, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            finalMap.put(ch, finalMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            // Creating a hashmap for each consecutive string
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            // Checking if characters of first string is present in this string or not.
            for (char c : finalMap.keySet()) {
                if (map.containsKey(c)) {
                    // If present then take minimum of both as question says to include duplicates.
                    finalMap.put(c, Math.min(map.get(c), finalMap.get(c)));
                } else {
                    // We can't directly remove 'c' here, it will give
                    // 'concurrentModificationError'.
                    // Instead we will reduce it to 0, and while making resultant list we will only
                    // take those whose values are more than 0.
                    finalMap.put(c, 0);
                }
            }
        }

        for (char c : finalMap.keySet()) {
            for (int i = 0; i < finalMap.get(c); i++) {
                res.add(Character.toString(c));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String words[] = { "bella", "label", "roller" };
        System.out.println(commonChars(words));
    }
}
