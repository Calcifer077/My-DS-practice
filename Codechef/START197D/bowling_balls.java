import java.util.*;

public class bowling_balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int count = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                if (a >= x && a <= y) {
                    count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}