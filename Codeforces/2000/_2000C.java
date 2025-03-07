// Numeric string template

import java.util.*;

public class _2000C {
    public static void sovle(int arr[], String s) {
        if (arr.length != s.length()) {
            System.out.println("NO");
            return;
        }

        HashMap<Integer, Character> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i])) {
                if (map1.get(arr[i]) != s.charAt(i)) {
                    System.out.println("NO");
                    return;
                }
            } else if (map2.containsKey(s.charAt(i))) {
                if (map2.get(s.charAt(i)) != arr[i]) {
                    System.out.println("NO");
                    return;
                }
            } else {
                map1.put(arr[i], s.charAt(i));
                map2.put(s.charAt(i), arr[i]);
            }
        }

        System.out.println("YES");
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

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String s = sc.next();
                sovle(arr, s);
            }

            t--;
        }
        sc.close();
    }
}