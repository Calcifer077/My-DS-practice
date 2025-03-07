// MEX Destruction

import java.util.*;

public class _2049A {
    public static int solve(int arr[]) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == arr.length) {
            return 0;
        }

        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                pos = i;
                break;
            }
        }

        int a = -1;
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] == 0) {
                a = i;
                break;
            }
        }

        if (a == -1) {
            return 1;
        }
        boolean one = true;
        for (int i = a; i < arr.length; i++) {
            if (arr[i] != 0) {
                one = false;
                break;
            }
        }

        if (one) {
            return 1;
        }

        return 2;
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
            System.out.println(solve(arr));
            t--;
        }
        sc.close();
    }
}