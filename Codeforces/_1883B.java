// Chemistry

import java.util.*;

public class _1883B {
    public static void main(String[] args) {
        // In this question we have to remove some characters so that resulting string
        // is a palidrome.

        // If all characters are of even frequency then we can form a palidrome

        // If odd frequency characters is 1 or we can reduce them to one by removin them
        // then also resulting string will be a palindrome

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int ch[] = new int[26];

            // Calculating frequency of each element.
            for (int i = 0; i < n; i++) {
                ch[s.charAt(i) - 'a']++;
            }

            int numOfOdd = 0;
            for (int i = 0; i < 26; i++) {
                if (ch[i] % 2 == 1) {
                    numOfOdd++;
                }
            }

            if (numOfOdd > k + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            t--;
        }
        sc.close();
    }
}