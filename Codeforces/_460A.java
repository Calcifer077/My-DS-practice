// Vasya and socks

import java.util.*;

public class _460A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;
        for (int i = 1;; i++) {
            n--;
            if (n < 0) {
                break;
            }
            if (i % m == 0) {
                n++;
            }
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}