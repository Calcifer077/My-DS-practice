// Blackboard Game

import java.util.*;

public class _2123A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 4 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}