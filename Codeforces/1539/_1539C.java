// Stable Groups

import java.util.*;

public class _1539C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();

        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        List<Long> list = new LinkedList<>();

        for (int i = 1; i < n; i++) {
            long diff = arr[i] - arr[i - 1];
            if (diff > x) {
                list.add((diff - 1) / x);
            }
        }

        Collections.sort(list);

        int groups = list.size() + 1;

        for (long i : list) {
            if (k >= i) {
                k -= i;
                groups--;
            } else {
                break;
            }
        }

        System.out.println(groups);

        sc.close();
    }
}