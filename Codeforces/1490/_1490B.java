// Balanced Remainders

import java.util.*;

public class _1490B {
    public static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        return min;
    }

    public static void main(String[] args) {
        // According to question every element falls into any one of the three
        // categories.
        // Either it can be of remainder 0, 1 or 2.
        // Our goal is to make sure that every category have equal number of elements.
        // What we can do is target those element who have greater than n / 3 elements
        // and convert them into the next category. Do so until all the categories have
        // the same number of elements.

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[3];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[a % 3]++;
            }

            int res = 0;

            while (findMin(arr) != n / 3) {
                for (int i = 0; i < 3; i++) {
                    if (arr[i] > n / 3) {
                        res++;
                        arr[i]--;
                        arr[(i + 1) % 3]++;
                    }
                }
            }

            System.out.println(res);
        }
        sc.close();
    }
}