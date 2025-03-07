// Make it zero

import java.util.*;

public class _1869A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
            } else {
                System.out.println(4);
                System.out.println(1 + " " + (n - 1));
                System.out.println(1 + " " + (n - 1));
                System.out.println((n - 1) + " " + n);
                System.out.println((n - 1) + " " + n);
            }
            t--;
        }

        sc.close();
    }
}