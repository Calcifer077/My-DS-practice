package Codechef.START206D;

import java.util.*;

public class gladiator_fighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int lower = n - 2;

            int upper = 0;

            n -= 2;
            upper = (n * (n + 1)) / 2;

            System.out.println(lower + " " + upper);
        }
        sc.close();
    }
}