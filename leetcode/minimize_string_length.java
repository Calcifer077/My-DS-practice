package leetcode;

import java.util.HashSet;

public class minimize_string_length {
    // Brute force
    /*
     * 
     * public static int minimizeStringLengh(String s) {
     * 
     * // Count number of occurances of characters.
     * HashMap<Character, Integer> map = new HashMap<>();
     * for (int i = 0; i < s.length(); i++) {
     * char ch = s.charAt(i);
     * 
     * if (map.containsKey(ch)) {
     * map.put(ch, map.get(ch) + 1);
     * } else {
     * map.put(ch, 1);
     * }
     * }
     * 
     * Stack<Character> st = new Stack<>();
     * for (int i = 0; i < s.length(); i++) {
     * char ch = s.charAt(i);
     * if (map.containsKey(ch)) {
     * if (map.get(ch) > 1) {
     * Stack<Character> st2 = new Stack<>();
     * // Remove all characters from stack1 and insert them nto stack2.
     * while (!st.empty()) {
     * // If the top of stack is equal to 'ch'.
     * // Why are we breaking after only find, because in one operation you can
     * remove
     * // only character.
     * if (st.peek() == ch) {
     * st.pop();
     * map.put(ch, map.get(ch) - 1);
     * break;
     * } else {
     * // If they are not matching simply push them into the stack.
     * st2.push(st.pop());
     * }
     * }
     * 
     * while (!st2.empty()) {
     * st.push(st2.pop());
     * }
     * 
     * }
     * 
     * st.push(ch);
     * }
     * }
     * return st.size();
     * }
     */

    public static int minimizeStringLengh(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }

    public static void main(String[] args) {
        String s = "aaabc";
        System.out.println(minimizeStringLengh(s));
    }
}