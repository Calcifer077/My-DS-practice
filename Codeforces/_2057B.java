// Gorilla and the exam

import java.util.*;

public class _2057B {
    public static void sovle(int k, int arr[]) {
        Arrays.sort(arr);
        List<Integer> cnt = new ArrayList<>();
        cnt.add(1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt.set(cnt.size() - 1, cnt.get(cnt.size() - 1) + 1);
            } else {
                cnt.add(1);
            }
        }

        Collections.sort(cnt);
        int m = cnt.size();
        for (int i = 0; i < m - 1; i++) {
            if (cnt.get(i) > k) {
                System.out.println(m - i);
                return;
            }
            k -= cnt.get(i);
        }
        System.out.println(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sovle(k, arr);

            t--;
        }
        sc.close();
    }
}