
import java.util.*;

public class group_anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        int index = 0;
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            // If the sorted string is not already in the map, create a new list in `res`
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, index); // Store the index of this group in the map
                res.add(new ArrayList<>()); // Add a new list for this group
                index++;
            }

            // Add the current string to the correct list in `res`
            int pos = map.get(sortedStr);
            res.get(pos).add(str); // Update the list in place
        }

        return res;
        // for (String s : strs) {
        // char ch[] = s.toCharArray();
        // Arrays.sort(ch);
        // String str = new String(ch);

        // if (!map.containsKey(str)) {
        // map.put(str, new ArrayList<>());
        // }
        // map.get(str).add(s);
        // }

        // return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }
}
