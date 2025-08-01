import java.util.*;

public class sugar_limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
            }

            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i][1] = sc.nextInt();
                max = Math.max(max, a[i][1]);
            }

            int globalmax = 0;

            // Trying out every possibilites
            for (int i = 0; i <= max; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j][0] > 0 && a[j][1] <= i) {
                        sum += a[j][0];
                    }
                }

                globalmax = Math.max(globalmax, sum - i);
            }

            System.out.println(globalmax);
        }
        sc.close();
    }
}