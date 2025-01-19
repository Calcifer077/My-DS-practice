package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class minimum_index_sum_of_two_lists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        // Store strings of list1 with their index.
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        // Store strings of list2 with their index.
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }

        int min = Integer.MAX_VALUE;

        // Only run for the size of map which is minimum.
        if (map1.size() <= map2.size()) {
            // Calculate the minimum sum of index.
            for (String s : map1.keySet()) {
                if (map2.containsKey(s)) {
                    if (map1.get(s) + map2.get(s) <= min) {
                        min = map1.get(s) + map2.get(s);
                    }
                }
            }

            // Store strings which achievs the condition.
            ArrayList<String> list = new ArrayList<>();

            for (String s : map1.keySet()) {
                if (map2.containsKey(s)) {
                    if (map1.get(s) + map2.get(s) == min) {
                        list.add(s);
                    }
                }
            }

            // Convert list to string[]
            String res[] = new String[list.size()];

            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }

            return res;
        } else {
            // Find the minimum index sum
            for (String s : map2.keySet()) {
                if (map1.containsKey(s)) {
                    if (map1.get(s) + map2.get(s) <= min) {
                        min = map1.get(s) + map2.get(s);
                    }
                }
            }

            ArrayList<String> list = new ArrayList<>();

            // Only get those strings which match the condition
            for (String s : map2.keySet()) {
                if (map1.containsKey(s)) {
                    if (map1.get(s) + map2.get(s) == min) {
                        list.add(s);
                    }
                }
            }

            // Convert list to string
            String res[] = new String[list.size()];

            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }

            return res;
        }

    }

    public static void main(String[] args) {
        String list1[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };

        System.out.println(findRestaurant(list1, list2));
    }
}
