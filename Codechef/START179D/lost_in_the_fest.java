package Codechef.START179D;

import java.util.*;

public class lost_in_the_fest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] >= arr[n - 1]) {
                    break;
                } else {
                    count++;
                }
            }

            System.out.println(n - count - 1);
        }
        sc.close();
    }
}