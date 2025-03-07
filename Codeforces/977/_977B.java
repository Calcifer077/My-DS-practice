// Two-gram

import java.util.*;

public class _977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        HashMap<String, Integer> map = new HashMap<>();

        // Storing pairs of strings with length 2 only.
        for (int i = 0; i < n - 1; i++) {
            // Converting characters to string.
            String a = s.charAt(i) + "" + s.charAt(i + 1);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int max = -1;
        // Finding the maximum value.
        for (String c : map.keySet()) {
            max = Math.max(max, map.get(c));
        }

        // Printing the string that have the maximum value.
        for (String c : map.keySet()) {
            if (max == map.get(c)) {
                System.out.println(c);
                break;
            }
        }

        sc.close();
    }
}