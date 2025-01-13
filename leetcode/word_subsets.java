package leetcode;

import java.util.*;

public class word_subsets {
    // words1 ->
    // words2 -> these are the charcters which we have to check if it is present in
    // the above strings.
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        // List<String> res = new ArrayList<>();

        /*
         * // BRUTE FORCE
         * for (int i = 0; i < words1.length; i++) {
         * String str = words1[i];
         * 
         * // Will calculate the matching characters
         * int count = 0;
         * 
         * // Will calculate the size of to be matched charactes
         * int size = 0;
         * 
         * // So that we don't get a wrong answer in first 'if' condition.
         * boolean flag = false;
         * for (int j = 0; j < words2.length; j++) {
         * 
         * // If the string to which we have to match has length more than the string
         * which
         * // we are mathcing then it is not possible to have a complete match or a
         * // possibilty of a subset.
         * if (words2[j].length() > str.length()) {
         * flag = true;
         * break;
         * }
         * 
         * size += words2[j].length();
         * 
         * // We are using a hashmap of character and integer because we also have to
         * check
         * // for multiplicity of characters meaning that if a charcater occurs two
         * times
         * // in 'words2[]' then it should also occur two times in 'words1[]'
         * HashMap<Character, Integer> map = new HashMap<>();
         * for (int k = 0; k < words2[j].length(); k++) {
         * if (map.containsKey(words2[j].charAt(k))) {
         * map.put(words2[j].charAt(k), map.get(words2[j].charAt(k)) + 1);
         * } else {
         * map.put(words2[j].charAt(k), 1);
         * }
         * }
         * 
         * // Checking for 'words1', if they have a match to 'words2'
         * for (int k = 0; k < str.length(); k++) {
         * if (map.containsKey(str.charAt(k))) {
         * if (map.get(str.charAt(k)) >= 1) {
         * count++;
         * map.put(str.charAt(k), map.get(str.charAt(k)) - 1);
         * }
         * }
         * }
         * 
         * }
         * 
         * if (count == size && !flag) {
         * res.add(str);
         * }
         * }
         */

        List<String> res = new ArrayList<>();

        // To store the values of characters of 'words2'
        HashMap<Character, Integer> map1 = new HashMap<>();

        // We are storing the total value for each character accross all 'words2'
        // beacause all of them should be present in words1[i].
        for (int i = 0; i < words2.length; i++) {
            String str = words2[i];

            // This will calculate the frequency for each character in the current word,
            HashMap<Character, Integer> map3 = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (map3.containsKey(ch)) {
                    map3.put(ch, map3.get(ch) + 1);
                } else {
                    map3.put(ch, 1);
                }
            }

            // This is used to calculate the maximum of both.
            // Suppose you have two words in word2[], 'aa', 'aaa'. Then you need to add 'a'
            // with value 3 as 'a' with value is already included in it.
            for (Character j : map3.keySet()) {
                if (map1.containsKey(j)) {
                    map1.put(j, Math.max(map1.get(j), map3.get(j)));
                } else {
                    map1.put(j, map3.get(j));
                }
            }
        }

        for (int i = 0; i < words1.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<>();

            String str = words1[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (map2.containsKey(ch)) {
                    map2.put(ch, map2.get(ch) + 1);
                } else {
                    map2.put(ch, 1);
                }
            }

            boolean flag = false;
            for (Character j : map1.keySet()) {
                // If 'j' is not present or its value is less than required, then it is not the
                // answer.
                if (!map2.containsKey(j) || map2.get(j) < map1.get(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                res.add(str);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] words1 = { "amazon", "apple", "facebook", "google", "leetcode" };
        String[] words2 = { "e", "l" };

        System.out.println(wordSubsets(words1, words2));

    }
}
