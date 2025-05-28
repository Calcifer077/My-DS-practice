// Replacement

import java.util.*;

public class _2029B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();

            int one = 0;
            int zero = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    one++;
                } else {
                    zero++;
                }
            }

            boolean flag = true;
            for (char c : r.toCharArray()) {
                if (one == 0 || zero == 0) {
                    flag = false;
                    break;
                }
                if (c == '1') {
                    zero--;
                } else {
                    one--;
                }
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
}

// 6
// 2
// 11
// 0
// 2
// 01
// 1
// 4
// 1101
// 001
// 6
// 111110
// 10000
// 6
// 010010
// 11010
// 8
// 10010010
// 0010010

// oneS -> 3, zeroS -> 5, oneR -> 2, zeroR -> 5