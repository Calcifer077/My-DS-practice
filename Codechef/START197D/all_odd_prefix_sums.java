import java.util.*;

public class all_odd_prefix_sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 2 == 1) {
                    odd++;
                } else {
                    even++;
                }
            }

            if (odd == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}