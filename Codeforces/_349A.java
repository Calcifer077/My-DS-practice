// Cinema line

import java.util.*;

public class _349A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int twentyFive = 0;
        int fifty = 0;

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (flag) {

                if (a == 25) {
                    twentyFive++;
                } else if (a == 50) {
                    if (twentyFive >= 1) {
                        twentyFive--;
                        fifty++;
                    } else {
                        flag = false;
                    }
                } else {
                    if (fifty >= 1 && twentyFive >= 1) {
                        fifty--;
                        twentyFive--;
                    } else if (twentyFive >= 3) {
                        twentyFive -= 3;
                    } else {
                        flag = false;
                    }
                }
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}