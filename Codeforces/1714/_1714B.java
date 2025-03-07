// Remove Prefix

import java.util.*;

public class _1714B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            // Frequency coutner.
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                list.add(a);

                map.put(a, map.getOrDefault(a, 0) + 1);
            }

            // This will only contain duplicates elements.
            HashSet<Integer> set = new HashSet<>();
            for (int i : map.keySet()) {
                if (map.get(i) > 1) {
                    set.add(i);
                }
            }

            // There are no duplicate elements.
            if (set.size() == 0) {
                System.out.println(0);
            } else {
                int max = -1;

                // Need to remove all the elements that are duplicate. If some are not duplicate
                // but someone is after them then we need to remove them also.
                for (int i = 0; i < n; i++) {
                    int a = list.get(i);
                    if (set.contains(a)) {

                        // Don't do it if only one occurance is left.
                        if (map.get(a) > 1) {

                            // Reducing the occurance because we have removed it.
                            map.put(a, map.get(a) - 1);
                            max = i + 1;
                        }
                    }
                }

                System.out.println(max);
            }

            t--;
        }
        sc.close();
    }
}