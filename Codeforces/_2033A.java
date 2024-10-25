// Sakurako and kosuke

import java.util.*;

public class _2033A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            if (n % 2 == 1) {
                System.out.println("Kosuke");
            } else {
                System.out.println("Sakurako");
            }
            t--;
        }
        sc.close();
    }
}