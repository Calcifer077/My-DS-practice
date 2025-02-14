// Two teams composing

import java.util.*;

public class _1335C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            // To get all the unique elements as first team should consist of only unique
            // elements.
            HashSet<Integer> set = new HashSet<>();

            // Frequecny counter to get the maximum number of similar elements.
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                set.add(arr[i]);
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int a = set.size();
            int b = 0;

            int max = 0;
            int globalMax = 0;

            // There are two cases:
            // 1) You don't consider the element that occurs maximum time in the first team.
            // In this case you have to subtract -1 from set size.

            // 2) You consider maximum time element in first team then you have to subtract
            // it from hashmap.
            for (int i : map.keySet()) {
                b = Math.max(b, map.get(i));

                globalMax = Math.max(globalMax, Math.min(a - 1, map.get(i)));
                max = Math.max(Math.min(a, map.get(i) - 1), max);
            }

            if (n == 1) {
                System.out.println(0);
            } else if (b == 1 || a == 1) {
                System.out.println(1);
            } else {
                System.out.println(Math.max(globalMax, max));
            }

            t--;
        }
        sc.close();
    }
}