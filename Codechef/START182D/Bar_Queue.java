package Codechef.START182D;

import java.util.*;

public class Bar_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int boys = 0;
            int girls = 0;

            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'B') {
                    boys++;
                } else {
                    girls++;
                }
                count++;

                if (2 * girls < boys) {
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}