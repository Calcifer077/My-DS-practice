// Dungeon

import java.util.*;

public class _1463A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            // At every 7th shot we deal total damage of 9.
            // If total sum is not a multiple of 9 then answer is not possible.
            if ((a + b + c) % 9 != 0) {
                System.out.println("NO");
            } else {
                // If any of them is less than the multiple we found above then that also is not
                // a answer
                if (Math.min(a, Math.min(b, c)) >= (a + b + c) / 9) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}