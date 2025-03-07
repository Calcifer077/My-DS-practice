// The Legend of Freya the Frog

import java.util.*;

public class _2009C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double k = sc.nextDouble();

            long a = (long) (2 * Math.ceil(y / k));
            long b = (long) (2 * Math.ceil(x / k) - 1);

            System.out.println(Math.max(a, b));
            t--;
        }
        sc.close();
    }
}