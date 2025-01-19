package leetcode;

import java.util.*;

public class find_resultant_array_after_removing_anagrams {
    public static List<String> removeAnagrams(String[] words) {
        // Below is the approach if we have to remove all anagrams.

        /*
         * 
         * List<String> res = new ArrayList<>();
         * 
         * HashSet<String> set = new HashSet<>();
         * 
         * // Add sorted strings in set.
         * for (int i = 0; i < words.length; i++) {
         * char ch[] = words[i].toCharArray();
         * Arrays.sort(ch);
         * 
         * String str = new String(ch);
         * 
         * set.add(str);
         * }
         * 
         * for (String s : words) {
         * char ch[] = s.toCharArray();
         * Arrays.sort(ch);
         * 
         * String str = new String(ch);
         * 
         * // If the sorted version is present in set then, it means that it is first
         * // occurance, add 's' to 'res' due to which the sorted array is formed, and
         * // remove sorted version form the set.
         * // If sorted version is not present in the set then it means that its anagram
         * // has already been added to the res.
         * if (set.contains(str)) {
         * res.add(s);
         * set.remove(str);
         * }
         * }
         * 
         * return res;
         */

        /*
         * 
         * List<String> res = new ArrayList<>();
         * 
         * ArrayList<String> list = new ArrayList<>();
         * for (int i = 0; i < words.length; i++) {
         * list.add(words[i]);
         * }
         * 
         * for (int i = 0; i < list.size(); i++) {
         * char ch[] = list.get(i).toCharArray();
         * Arrays.sort(ch);
         * 
         * String s1 = new String(ch);
         * 
         * for (int j = i + 1; j < words.length; j++) {
         * char ch1[] = list.get(j).toCharArray();
         * Arrays.sort(ch1);
         * 
         * String s2 = new String(ch1);
         * 
         * // Where therer are consecutive anagrams add a space there which we will
         * remove later on.
         * if (s1.equals(s2)) {
         * list.remove(j);
         * list.add(j, " ");
         * } else {
         * break;
         * }
         * }
         * }
         * 
         * for (int i = 0; i < list.size(); i++) {
         * if (list.get(i) != " ") {
         * res.add(list.get(i));
         * }
         * }
         * return res;
         */

        // A much more optimized way
        List<String> res = new ArrayList<>();

        String prev = "";
        for (String s : words) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);

            String s1 = new String(ch);

            if (!s1.equals(prev)) {
                res.add(s);
                prev = s1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
        String[] words = { "a", "b", "a" };
        System.out.println(removeAnagrams(words));
        // performDeletion();
    }
}
