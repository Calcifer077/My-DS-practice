// Atilla's Favorite Problem

import java.util.*;

public class _1760B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int arr[] = new int[26];
            for (int i = 0; i < n; i++) {
                arr[str.charAt(i) - 97]++;
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
            t--;
        }
        sc.close();
    }
}