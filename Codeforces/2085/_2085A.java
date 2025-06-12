// Serval and String Theory

import java.util.*;

public class _2085A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            // If there exists a single character
            int freq[] = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            boolean flag = false;
            for (int i = 0; i < 26; i++) {
                if (freq[i] == n) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("NO");
            } else {
                StringBuilder sb = new StringBuilder(s);
                StringBuilder rev = new StringBuilder(s);

                if (rev.reverse().compareTo(sb) > 0) {
                    System.out.println("YES");
                } else {
                    if (k > 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }

        }
        sc.close();
    }
}