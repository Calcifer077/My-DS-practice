// Prepend and Append

import java.util.*;

public class _1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int i = 0;
            int j = n - 1;
            int count = n;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    i++;
                    j--;
                    count -= 2;
                } else {
                    break;
                }
            }

            System.out.println(count);
            t--;
        }
        sc.close();
    }
}