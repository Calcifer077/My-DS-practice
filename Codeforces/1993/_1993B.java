// Parity and Sum

import java.util.*;

public class _1993B {
    public static void main(String[] args) {
        // How this code work?
        // If all are even or odd then there is no need to do any operation as all are
        // of same parity.

        // If input contains even a single odd element then it is impossible to convert
        // all even to odd.
        // Because sum of even and odd is odd, and if you sum two odd numbers one of
        // them will still remain odd.

        // To convert all even to odd, find the largest odd element and try to transform
        // all even to odd, by traversing them from smaller to larger. Also update odd
        // number as you traverse the array as given in the question statement.

        // If at any point even number is more than the max odd number then answer will
        // be number of even + 1 as you have to perform the same operation on odd number
        // again, else answer will be number of even number.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            List<Long> evenNum = new ArrayList<>();
            long maxOdd = 0;
            long even = 0;
            long odd = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();

                if (a % 2 == 0) {
                    evenNum.add(a);
                    even++;
                } else {
                    maxOdd = Math.max(maxOdd, a);
                    odd++;
                }
            }

            if (even == n || odd == n) {
                System.out.println(0);
            } else {
                Collections.sort(evenNum);

                boolean flag = false;
                for (int i = 0; i < evenNum.size(); i++) {
                    if (evenNum.get(i) < maxOdd) {
                        maxOdd += evenNum.get(i);
                    } else {
                        flag = true;
                    }
                }

                if (flag) {
                    System.out.println(even + 1);
                } else {
                    System.out.println(even);
                }
            }

        }
        sc.close();
    }
}