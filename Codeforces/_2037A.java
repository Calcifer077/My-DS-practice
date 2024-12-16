// Twice

import java.util.*;

public class _2037A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                if (count.containsKey(arr[i])) {
                    count.put(arr[i], count.get(arr[i]) + 1);
                } else {
                    count.put(arr[i], 1);
                }
            }

            int ans = 0;
            for (Map.Entry<Integer, Integer> set : count.entrySet()) {
                ans += set.getValue() / 2;
            }

            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}