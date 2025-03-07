// Love story

import java.util.*;

public class _1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            String code = "codeforces";

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != code.charAt(i)) {
                    count++;
                }
            }

            System.out.println(count);
            t--;
        }
        sc.close();
    }
}