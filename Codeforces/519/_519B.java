// A and B and Compilation Errors

import java.util.*;

public class _519B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Using a frequency counter to check which element is not present 2nd and 3rd
        // time.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            map2.put(a, map2.getOrDefault(a, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (!map2.containsKey(i) || map2.get(i) < map.get(i)) {
                System.out.println(i);
                break;
            }
        }

        // Emptying the hashmap.
        map.clear();
        for (int i = 0; i < n - 2; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (int i : map2.keySet()) {
            if (!map.containsKey(i) || map.get(i) < map2.get(i)) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}