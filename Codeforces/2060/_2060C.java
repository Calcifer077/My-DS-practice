// Game of Mathletes

import java.util.*;

public class _2060C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int count = 0;

            // Just find pairs that will make up the target
            for (int i = 0; i < n; i++) {
                int diff = k - arr[i];

                if (map.containsKey(diff) && map.get(diff) > 0) {
                    if (diff == arr[i]) {
                        if (map.get(arr[i]) >= 2) {
                            count++;
                            map.put(arr[i], map.get(arr[i]) - 2);
                        }
                        continue;
                    } else if (map.get(arr[i]) > 0) {
                        count++;
                        map.put(arr[i], map.get(arr[i]) - 1);
                        map.put(diff, map.get(diff) - 1);
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}