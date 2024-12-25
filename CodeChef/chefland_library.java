package CodeChef;

import java.util.*;

public class chefland_library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], i + 1);
                } else {
                    map.putIfAbsent(arr[i], i + 1);
                }
            }

            int res = 0;
            for (int i : map.keySet()) {
                res += map.get(i);
            }
            System.out.println(res);

            t--;
        }
        sc.close();
    }
}