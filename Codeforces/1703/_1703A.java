// Yes or Yes?

import java.util.*;

public class _1703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            if (s.charAt(0) != 'y' && s.charAt(0) != 'Y') {
                System.out.println("NO");
            } else if (s.charAt(1) != 'e' && s.charAt(1) != 'E') {
                System.out.println("NO");
            } else if (s.charAt(2) != 's' && s.charAt(2) != 'S') {
                System.out.println("NO");
            } else {
                System.out.println("Yes");
            }

            t--;
        }
        sc.close();
    }
}