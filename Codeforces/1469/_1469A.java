// Regular Bracket Sequence

import java.util.*;

public class _1469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            // It is given in the question that you will always get only one opening bracket
            // and only one closing bracket, rest will be '?'.

            // If length is odd then we can't form the RBS
            // If first bracket is a closing bracket, then we can't form a RBS
            // If last bracket is opening bracket, then we can't form a RBS
            // In any other case we can form a RBS.

            if (s.length() % 2 == 1) {
                System.out.println("NO");
            } else {
                if (s.charAt(0) == ')') {
                    System.out.println("NO");
                } else if (s.charAt(s.length() - 1) == '(') {
                    System.out.println("NO");
                } else {
                    System.out.println("YEs");
                }
            }
            t--;
        }
        sc.close();
    }
}