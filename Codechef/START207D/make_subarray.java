package Codechef.START207D;

import java.util.*;

public class make_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int w = 0, b = 0;

            for (char c : s.toCharArray()) {
                if (c == '0')
                    w++;
                else
                    b++;
            }

            if (b == 0) {
                System.out.println(0);
            } else {
                int first = -1, last = -1;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        last = i;

                        if (first == -1)
                            first = i;
                    }
                }

                int count = 0;
                for (int i = first; i <= last; i++) {
                    if (s.charAt(i) == '0')
                        count++;
                }

                System.out.println(count);

            }
        }
        sc.close();
    }
}