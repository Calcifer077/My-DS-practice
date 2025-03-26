// Towers

import java.util.*;

public class _37A {
    public static void main(String[] args) {
        // Have to print total number of distinct numbers and count of the number that
        // occurs maximum time.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = -1;
        for (int i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }

        System.out.println(max + " " + map.size());

        sc.close();
    }
}