package leetcode;

import java.util.*;

public class sort_characters_by_frequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Counting frequency for each character.
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Creating a priority queue which will store values in descending order.
        // Descending order is defined by the comparator: 'b.getValue() -
        // a.getValue()'.
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue());

        // Adding all the values from map to priority queue.
        pq.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();

        while (!pq.isEmpty()) {
            // 'pq.poll' is used to get the head of queue
            // 'Map.Entry' is the type of value stored in priority queue.
            Map.Entry<Character, Integer> entry = pq.poll();

            // 'entry.getKey()' gets character out if 'entry' and 'entry.getValue()' gets
            // integer with respect of a particular character stored in the priority
            // queue.
            res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
