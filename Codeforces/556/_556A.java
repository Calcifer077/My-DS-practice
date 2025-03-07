// Case of the Zeros and Ones

import java.util.*;

public class _556A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();

        int count1 = 0;
        int count0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count1++;
            } else {
                count0++;
            }
        }

        System.out.println(Math.abs(count0 - count1));
        sc.close();
    }
}