import java.util.ArrayList;
import java.util.HashSet;

public class number_of_substrings_containing_all_three_characters {
    public static int numberOfSubstrings(String s) {

        // Brute force - calculate all substrings and check if a,b,c exists in them.
        // int res = 0;
        // int n = s.length();
        /*
         * 
         * for (int i = 0; i < n; i++) {
         * for (int j = i + 2; j < n; j++) {
         * HashSet<Character> set = new HashSet<>();
         * for (int k = i; k <= j; k++) {
         * char c = s.charAt(k);
         * System.out.print(c + " ");
         * set.add(c);
         * }
         * if (set.size() == 3) {
         * res++;
         * }
         * 
         * // System.out.println();
         * }
         * }
         */
        int i = 0;
        int j = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int ans = 0;

        // How below approach works is:
        // We will take a window that contains all three characters 'a', 'b', 'c'.
        // If any window contains all these characters, then the number of substrings
        // that will satisfy this condition is s.length() - j where j is right bound of
        // this window.

        // Why?
        // In question we are asked to find the substrings that contains at least one
        // occurance of all three 'a', 'b', 'c'. After such a substring is found all the
        // followinf substring that starts at this position will also satisfy this
        // condition.

        // After finding such window we will try to shrink it by reducing its size from
        // left. So that we can find more such window.

        int n = s.length();
        while (j < n) {
            if (s.charAt(j) == 'a')
                aCount++;
            if (s.charAt(j) == 'b')
                bCount++;
            if (s.charAt(j) == 'c')
                cCount++;

            // All three characters are present.
            while (aCount > 0 && bCount > 0 && cCount > 0) {
                ans += s.length() - j;
                // Here, we are shrinking window. If left is 'a' then the remaining window will
                // not contain this 'a', 'b' or 'c' as we are shrinking.
                if (s.charAt(i) == 'a')
                    aCount--;
                if (s.charAt(i) == 'b')
                    bCount--;
                if (s.charAt(i) == 'c')
                    cCount--;

                i++;
            }

            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
