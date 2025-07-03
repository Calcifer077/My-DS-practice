// Subsequence Update

import java.util.*;

public class _2063B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--;
            r--;

            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> more = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (i <= r) {
                    less.add(a);
                }
                if (i >= l) {
                    more.add(a);
                }
            }

            less.sort((a, b) -> a - b);
            more.sort((a, b) -> a - b);

            int index = r - l + 1;
            long a = 0;

            if (less.size() >= index) {
                for (int i = 0; i < index && i < less.size(); i++) {
                    a += less.get(i);
                }
            }

            long b = 0;
            if (index <= more.size()) {
                for (int i = 0; i < index && i < more.size(); i++) {
                    b += more.get(i);
                }
            }

            if (a == 0) {
                System.out.println(b);
            } else if (b == 0) {
                System.out.println(a);
            } else {
                System.out.println(Math.min(a, b));
            }
        }
        sc.close();
    }
}