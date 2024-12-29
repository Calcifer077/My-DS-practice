// Flower city fence

import java.util.*;

public class _1862C {
    public static void sovle(int arr[], int n) {
        if (arr[1] != n) {
            System.out.println("NO");
            return;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            while (res.size() < arr[i]) {
                res.add(i);
            }
        }

        boolean ok = true;

        for (int i = 1; i <= n; i++) {
            if (arr[i] != res.get(i - 1)) {
                System.out.println("NO");
                ok = true;
                return;
            }
        }

        if (ok) {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            sovle(arr, n);

            t--;
        }
        sc.close();
    }
}