// Superultra's Favorite Permutation

import java.util.*;

public class _2037C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if (n < 5) {
                System.out.println(-1);
            } else {
                int i = 1;
                while (i <= n) {
                    if (i == 5) {
                        i = i + 2;
                        continue;
                    }
                    System.out.print(i + " ");
                    i = i + 2;
                }
                System.out.print(5 + " ");

                System.out.print(4 + " ");
                int j = 2;
                while (j <= n) {
                    if (j == 4) {
                        j = j + 2;
                        continue;
                    }
                    System.out.print(j + " ");
                    j = j + 2;
                }
                System.out.println();
            }
            t--;
        }
        sc.close();
    }
}