// Three Indices

import java.util.*;

public class _1380A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean flag = false;
            int a = -1;
            int b = -1;
            int c = -1;

            for (int i = 1; i < n - 1; i++) {
                int x = i + 1;
                int y = -1;
                int z = -1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] < arr[i]) {
                        y = j + 1;
                        break;
                    }
                }

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[i]) {
                        z = j + 1;
                        break;
                    }
                }

                if (y != -1 && z != -1) {
                    flag = true;
                    a = y;
                    b = x;
                    c = z;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}