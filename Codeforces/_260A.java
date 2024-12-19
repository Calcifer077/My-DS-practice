// Adding digits

import java.util.*;

public class _260A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int res = 0;
        int flag = 0;
        a = a * 10;
        for (int i = 0; i <= 9; i++) {
            if ((a + i) % b == 0) {
                flag = 1;
                res = a + i;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(-1);
        } else {
            System.out.print(res);
            for (int i = 0; i < n - 1; i++) {
                System.out.print(0);
            }
        }

        System.out.println();

        sc.close();
    }
}