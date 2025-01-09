// Expression

import java.util.*;

public class _479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int first = a + b + c;
        int second = a * b * c;
        int third = (a + b) * c;
        int fourth = a * (b + c);

        int max = Math.max(first, second);
        max = Math.max(max, third);
        max = Math.max(max, fourth);

        System.out.println(max);

        sc.close();
    }
}