// Distinct split

import java.util.*;

public class _1791D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int arr1[] = new int[26];
            int arr2[] = new int[26];

            for (char c : s.toCharArray()) {
                arr1[c - 'a']++;
            }

            // Checking for every point where split can happen.
            int ans = 0;
            for (char c : s.toCharArray()) {
                arr1[c - 'a']--;
                arr2[c - 'a']++;
                int curr = 0;
                for (int i = 0; i < 26; i++) {
                    // Here, we are taking min because if a character comes more than one time it
                    // won't affect the result as we have to only count unique.
                    curr += Math.min(1, arr1[i]) + Math.min(1, arr2[i]);
                }

                ans = Math.max(curr, ans);
            }

            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}