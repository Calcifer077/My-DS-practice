package leetcode;

import java.util.*;

public class backspace_string_compare {
    public static boolean backspaceCompare(String s, String t) {
        // Push elements in the stack. If the next character is '#' pop the top.
        // Don't push '#' into stack.
        Stack<Character> st1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#' && !st1.empty()) {
                st1.pop();
            } else if (ch != '#') {
                st1.push(ch);
            }
        }

        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#' && !st2.empty()) {
                st2.pop();
            } else if (ch != '#') {
                st2.push(ch);
            }
        }

        // If two stacks are of different sizes then its impossible for them to be
        // equal.
        if (st1.size() != st2.size()) {
            return false;
        }

        // Pop element one by one from both stack and if they are not equal return
        // false.
        while (!st1.empty() && !st2.empty()) {
            if (!(st1.pop().equals(st2.pop()))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";

        System.out.println(backspaceCompare(s, t));
    }
}
