import java.util.*;

public class _2091A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int zero = 0;
            int one = 0;
            int two = 0;
            int three = 0;
            int five = 0;

            int count = 0;
            int res = count;
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                count++;
                if (a == 0) {
                    zero++;
                }
                if (a == 1) {
                    one++;
                }
                if (a == 2) {
                    two++;
                }
                if (a == 3) {
                    three++;
                }
                if (a == 5) {
                    five++;
                }

                if (!flag && one >= 1 && zero >= 3 && three >= 1 && two >= 2 && five >= 1) {
                    flag = true;
                    res = count;
                }
            }

            if (flag) {
                System.out.println(res);
            } else {

                System.out.println(0);
            }
        }
        sc.close();
    }
}