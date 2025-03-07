// Progressive square

import java.util.*;

public class _1955B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int arr[] = new int[n * n];

            for (int i = 0; i < n * n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int mat[] = new int[n * n];
            mat[0] = arr[0];

            for (int i = 1; i < n; i++) {
                mat[i] = mat[i - 1] + c;
            }

            // Below loop is used to make the matrix which should be formed.
            // It makes them from top to bottom, column wise. First column is made by the
            // above loop rest will be made by this.
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i * n + j] = mat[(i - 1) * n + j] + d;
                }
            }

            Arrays.sort(mat);

            boolean flag = true;
            // If at any point the matrix that we made differes from the array of nums we
            // return false.
            for (int i = 0; i < n * n; i++) {
                if (arr[i] != mat[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}