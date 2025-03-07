// Colourblindness

import java.util.*;

public class _1722B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();

            boolean isEqual = true;
            for (int i = 0; i < n; i++) {
                if ((str1.charAt(i) == 'R' && str2.charAt(i) != 'R')
                        || (str2.charAt(i) == 'R' && str1.charAt(i) != 'R')) {
                    isEqual = false;
                }
            }

            if (isEqual) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}