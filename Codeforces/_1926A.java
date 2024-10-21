// Vlad and the best of five

import java.util.*;

public class _1926A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            int a = 0;
            int b = 0;
            for (int i = 0; i < 5; i++) {
                if (str.charAt(i) == 'A') {
                    a++;
                } else if (str.charAt(i) == 'B') {
                    b++;
                }
            }

            System.out.println(a > b ? 'A' : 'B');
            t--;
        }
        sc.close();
    }
}