
// Mahmoud and Longest Uncommon Subsequence
import java.util.*;

public class _766A {
    public static int solve(String s1, String s2) {
        if (s1.equals(s2)) {
            return -1;
        }

        if (!s1.equals(s2)) {
            return Math.max(s1.length(), s2.length());
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(solve(s1, s2));
        sc.close();
    }
}