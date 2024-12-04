// Waiting for

import java.util.*;

public class _2038J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int passenger = 0;
        while (t > 0) {
            char a = sc.next().charAt(0);
            int b = sc.nextInt();

            if (a == 'P') {
                passenger += b;
            } else {
                if (b > passenger) {
                    System.out.println("YES");
                    passenger = 0;
                } else {
                    System.out.println("NO");
                    passenger -= b;
                }
            }
            t--;
        }
        sc.close();
    }
}