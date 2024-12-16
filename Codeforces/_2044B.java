// Normal problem

import java.util.*;

public class _2044B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();

            String res = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == 'w') {
                    res += 'w';
                } else if (str.charAt(i) == 'p') {
                    res += 'q';
                } else {
                    res += 'p';
                }
            }
            System.out.println(res);
            t--;
        }
        sc.close();
    }
}