// Penchick and Satay Sticks

import java.util.*;

public class _2031B {

    public static void solve(int arr[]) {
        if (arr.length == 1) {
            System.out.println("YES");
            return;
        }

        if (arr[0] != 1 && arr[0] != 2) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != i + 1 && arr[i] != i + 2 && arr[i] != i) {
                System.out.println("NO");
                return;
            }
        }

        if (arr[arr.length - 1] != arr.length && arr[arr.length - 1] != arr.length - 1) {
            System.out.println("NO");
            return;
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

            solve(arr);
            t--;
        }
        sc.close();
    }
}