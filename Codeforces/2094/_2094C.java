//  Brr Brrr Patapim

import java.util.*;

public class _2094C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int mat[][] = new int[n][n];

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 2 * n; i++) {
                set.add(i + 1);
            }

            int ans[] = new int[2 * n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int index = i + 1 + j + 1;
                    ans[index] = mat[i][j];
                    if (set.contains(ans[index])) {
                        set.remove(ans[index]);
                    }
                }
            }

            // Find the number that didn't was not in the result.
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 2 * n; i++) {
                if (ans[i] == 0) {
                    list.add(i);
                }
            }

            for (int i : set) {
                ans[list.get(0)] = i;
                list.remove(0);
            }

            for (int i = 1; i <= 2 * n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}