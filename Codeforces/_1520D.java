// Same Differences

import java.util.*;

public class _1520D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            // This question asks us to count number of indices (i, j) such that i < j (i is
            // not equal to j) and aj - ai = j - i
            // aj - ai = j - i
            // aj - j = ai - i

            // We will store arr[i] - i in a hashmap
            // When we have more than one value for any particular, we will calculate number
            // of pairs
            // Number of pairs -> total number of substrings - number of characters that
            // form substring

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                map.put(arr[i] - i, map.getOrDefault(arr[i] - i, 0) + 1);
            }

            long res = 0;
            for (int i : map.keySet()) {
                // If frequecny is '1' then it can't form pair with anyone.
                if (map.get(i) > 1) {
                    long a = map.get(i) + 1;
                    long b = map.get(i);
                    res += ((a * b) / 2) - b;
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}