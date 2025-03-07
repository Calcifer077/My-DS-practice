// Hard problem

import java.util.*;

public class _2044C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int firstRow = m;
            int secondRow = m;
            long res = 0;
            if (a <= firstRow) {
                res += a;
                firstRow = firstRow - a;
                if (firstRow >= c) {
                    res += c;
                    c = 0;
                } else {
                    res += firstRow;
                    c = c - firstRow;
                }
            } else {
                res += firstRow;
            }

            if (b <= secondRow) {
                res += b;
                secondRow = secondRow - b;
                if (secondRow >= c && c > 0) {
                    res += c;
                    c = 0;
                } else if (c > 0 && secondRow < c) {
                    res += secondRow;
                    c = c - secondRow;
                }
            } else {
                res += secondRow;
            }

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}