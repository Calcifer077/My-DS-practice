package Codechef.START179D;

import java.util.*;

public class conquer_the_fest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        if (n >= b * 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}