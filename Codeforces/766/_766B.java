// Mahmoud and a Triangle

import java.util.*;

public class _766B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        boolean flag = false;
        for (int i = 0; i < n - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];

            if (a + b > c && b + c > a && a + c > b) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}