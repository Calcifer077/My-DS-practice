// Buttons

import java.util.*;

public class _268B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long res = n;
        for (int i = 1; i < n; i++) {
            res += i * (n - i);
        }
        System.out.println(res);
        sc.close();
    }
}