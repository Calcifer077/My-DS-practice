// Domino Piling

import java.util.*;

public class _50A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int total = m * n;
        System.out.println(total / 2);

        sc.close();
    }
}