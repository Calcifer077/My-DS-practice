// Lecture

import java.util.*;

public class _499B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String a = sc.next();
            String b = sc.next();

            // Whichever has less length add it to hashmap as its value. The key will always
            // be from the first language because that is the one professor speaks in.
            if (a.length() <= b.length()) {
                map.put(a, a);
            } else {
                map.put(a, b);
            }
        }

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            System.out.print(map.get(a) + " ");
        }
        System.out.println();
        sc.close();
    }
}