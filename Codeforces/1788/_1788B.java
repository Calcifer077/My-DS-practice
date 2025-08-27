// Sum of Two Numbers

import java.util.*;

public class _1788B {
    public static void main(String[] args) {
        // https://www.youtube.com/watch?v=5HwSJt5XDEo
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            List<Long> first = new ArrayList<>();
            List<Long> second = new ArrayList<>();

            boolean flag = true;

            for (char c : s.toCharArray()) {
                long digit = c - '0';

                if (digit % 2 == 0) {
                    first.add(digit / 2);
                    second.add(digit / 2);
                } else {
                    digit /= 2;
                    if (flag) {
                        first.add(digit);
                        second.add(digit + 1);
                        flag = false;
                    } else {
                        first.add(digit + 1);
                        second.add(digit);
                        flag = true;
                    }
                }
            }

            long zero = 0;
            for (int i = 0; i < first.size(); i++) {
                if (first.get(i) != 0) {
                    zero++;
                    System.out.print(first.get(i));
                }
                if (first.get(i) == 0 && zero > 0) {
                    System.out.print(first.get(i));
                }
            }
            if (zero == 0) {
                System.out.print(0);
            }
            System.out.print(" ");
            zero = 0;
            for (int i = 0; i < second.size(); i++) {
                if (second.get(i) != 0) {
                    zero++;
                    System.out.print(second.get(i));
                }
                if (second.get(i) == 0 && zero > 0) {
                    System.out.print(second.get(i));
                }
            }
            if (zero == 0) {
                System.out.print(0);
            }
            System.out.println();

        }
        sc.close();
    }
}