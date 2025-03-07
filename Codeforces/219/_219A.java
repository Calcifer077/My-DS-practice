// k-string

import java.util.*;

public class _219A {
    public static void main(String[] args) {
        // In this question we have to divide a given string into 'k' such parts such
        // that their concatentaion is equal to the original string.

        // We calculate frequency for each character.

        // If frequency for any character is not divisible by 'k' then that means that
        // given string is not divisible into 'k' parts
        // Otherwise we repeat the character such times that it is divisible by 'k'
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] % k != 0) {
                System.out.println(-1);
                sc.close();
                return;
            }

            char c = (char) (i + 'a');
            res.append(String.valueOf(c).repeat(freq[i] / k));
        }

        for (int i = 0; i < k; i++) {
            System.out.print(res);
        }
        sc.close();
    }
}