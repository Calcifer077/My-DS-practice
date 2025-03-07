// Game with colored Marbles

import java.util.*;

public class _2042B {
    public static int solve(ArrayList<Integer> values) {
        int alice = 0;
        for (int i = 0; i < values.size(); i++) {
            if (i % 2 == 0) {
                if (values.get(i) == 1) {
                    alice += 2;
                } else {
                    alice += 1;
                }
            } else {
                if (values.get(i) != 1) {
                    alice += 1;
                }
            }
        }

        return alice;
    }

    public static Map<Integer, Integer> calcFreq(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Map<Integer, Integer> map = calcFreq(arr);

            ArrayList<Integer> sorted = new ArrayList<>(map.values());

            Collections.sort(sorted);

            System.out.println(solve(sorted));
            t--;
        }
        sc.close();
    }
}