// Boats Competition

import java.util.*;

public class _1399C {

    // Have to calculate number of pairs that can form the sum.
    public static int solve(int target, int arr[]) {
        int res = 0;
        int n = arr.length;

        // If you pass hashmap which was created in the main function it will updated
        // for the future calls.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Using the same concept of 2sum
        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                // If both arr[i] and 'diff' are equal then there need to be atleast two of
                // them.
                if (arr[i] == diff) {
                    if (map.get(diff) > 1) {
                        res++;
                        map.put(diff, map.get(diff) - 2);
                    }
                } else {
                    if (map.get(diff) > 0 && map.get(arr[i]) > 0) {
                        res++;
                        map.put(diff, map.get(diff) - 1);
                        map.put(arr[i], map.get(arr[i]) - 1);
                    }
                }
            }
        }

        return res;
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

            // Find the minimum sum that we can achieve and the maximum sum that we can
            // achieve. Try to find pairs for all sum between minsum and maxsum.

            if (n < 2) {
                System.out.println(0);
            } else {
                // To find minimum sum and maximum sum
                Arrays.sort(arr);

                int minSum = arr[0] + arr[1];
                int maxSum = arr[n - 1] + arr[n - 2];

                int res = Integer.MIN_VALUE;
                for (int i = minSum; i <= maxSum; i++) {
                    res = Math.max(res, solve(i, arr));
                }

                System.out.println(res);
            }
            t--;
        }

        sc.close();
    }
}