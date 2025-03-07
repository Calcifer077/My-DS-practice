// Not adjacent matrix

import java.util.*;

public class _1520C {
    public static void solve(int n) {
        if (n == 1) {
            // There is only one element that can exist.
            System.out.println(1);
            return;
        }

        // We can't form a matrix in this case.
        if (n == 2) {
            System.out.println(-1);
            return;
        }

        // For a not adjacent matrix we need a difference between a cell and its
        // neigbhor (horizontal and vertical) to be atleast 2.
        // So first we will add all the odd elements, then we can add all the even
        // elements.
        int size = n * n;
        int arr[] = new int[size];
        int count = 1;

        for (int i = 0; i < size; i++) {
            arr[i] = count;
            count += 2;

            if (count > size) {
                count = 2;
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[k] + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            solve(n);
            t--;
        }
        sc.close();
    }
}