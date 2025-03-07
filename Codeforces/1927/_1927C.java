// Choose the Different Ones!

import java.util.*;

public class _1927C {
    public static void sovle(HashSet<Integer> map1, HashSet<Integer> map2, int k) {
        HashSet<Integer> map = new HashSet<>();
        for (int i : map1) {
            map.add(i);
        }
        for (int i : map2) {
            map.add(i);
        }

        if (map.size() == k && map1.size() >= k / 2 && map2.size() >= k / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int arr1[] = new int[n];
            int arr2[] = new int[m];

            HashSet<Integer> map1 = new HashSet<>();
            HashSet<Integer> map2 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
                if (arr1[i] <= k) {
                    map1.add(arr1[i]);
                }
            }

            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
                if (arr2[i] <= k) {
                    map2.add(arr2[i]);
                }
            }

            sovle(map1, map2, k);
            t--;
        }
        sc.close();
    }
}