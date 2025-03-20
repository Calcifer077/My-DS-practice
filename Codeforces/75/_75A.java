// Life Without Zeroes

import java.util.*;

public class _75A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // Converting string to integer and adding them up.
        long sum1 = Long.parseLong(s1) + Long.parseLong(s2);

        // Removing all the zeroes from the first string
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != '0') {
                sb1.append(s1.charAt(i));
            }
        }

        // Removing all the zeroes from the second string
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != '0') {
                sb2.append(s2.charAt(i));
            }
        }

        String newS1 = new String(sb1);
        String newS2 = new String(sb2);

        // If nothing is there, all the characters were zero
        if (newS1.length() < 1) {
            newS1 = "0";
        }
        if (newS2.length() < 1) {
            newS2 = "0";
        }
        // Summing up new strings
        long sum2 = Long.parseLong(newS1) + Long.parseLong(newS2);

        // Need to remove zeroes from original sum for comparison.
        String s3 = Long.toString(sum1);
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) != '0') {
                sb3.append(s3.charAt(i));
            }
        }

        s3 = new String(sb3);

        if (s3.length() < 1) {
            s3 = "0";
        }

        sum1 = Long.parseLong(s3);
        if (sum2 == sum1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}