// Balanced Shuffle (Easy)

import java.util.*;

public class _1970A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();

        int opening = 0;
        int closing = 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        if (s.charAt(0) == '(') {
            opening++;
        } else {
            closing++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        map.put(0, list);

        for (int i = 1; i < n; i++) {
            int balance = opening - closing;

            if (map.containsKey(balance)) {
                map.get(balance).add(i);
            } else {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(balance, l);
            }

            if (s.charAt(i) == '(') {
                opening++;
            } else {
                closing++;
            }
        }

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> balance = new ArrayList<>();
        for (int i : map.keySet()) {
            balance.add(i);
        }

        // Sorting in ascending order
        balance.sort((a, b) -> a - b);
        for (int i = 0; i < balance.size(); i++) {
            ArrayList<Integer> l = map.get(balance.get(i));

            // Sorting in descending order
            l.sort((a, b) -> b - a);

            for (int j = 0; j < l.size(); j++) {
                sb.append(s.charAt(l.get(j)));
            }
        }

        System.out.println(sb);

        sc.close();
    }
}