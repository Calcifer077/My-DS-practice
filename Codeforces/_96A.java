// Football

import java.util.*;

public class _96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int zeroCount = 0;
        int oneCount = 0;
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zeroCount++;
                oneCount = 0;
            } else {
                zeroCount = 0;
                oneCount++;
            }

            if (zeroCount == 7 || oneCount == 7) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}