// Delete from the Left

import java.util.*;

public class _1005B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int count1 = 0;
        int count2 = 0;

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                count1++;
                count2++;
            } else {
                break;
            }
            i--;
            j--;
        }

        System.out.println((s1.length() - count1) + (s2.length() - count2));
        sc.close();
    }
}