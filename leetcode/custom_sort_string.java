import java.util.*;

public class custom_sort_string {
    public static String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Frequecny counter for 's'.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            set.add(c);

            // Add characters in order.
            // As in 'order' characters are already sorted and unique below statement will
            // work.
            if (map.containsKey(c)) {
                sb.append(String.valueOf(c).repeat(map.get(c)));
            }
        }

        // Add those character which were not present in 'order'
        for (char c : map.keySet()) {
            if (!set.contains(c)) {
                sb.append(String.valueOf(c).repeat(map.get(c)));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String order = "bcafg";
        String s = "abcd";

        System.out.println(customSortString(order, s));
    }
}
