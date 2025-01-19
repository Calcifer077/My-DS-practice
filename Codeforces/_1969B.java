// Shifts and sorting

import java.util.*;

public class _1969B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            char arr[] = s.toCharArray();

            // Counting first position of one and total number of one.
            int countOne = 0;
            int start = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '1' && start == -1) {
                    start = i;
                }
                if (arr[i] == '1') {
                    countOne++;
                }
            }

            int end = start;
            long res = 0;

            // Loop will only run for the amount of zero present in the string, as that will
            // be the case of shifting.
            // Number of zeroes will only be counted from the first one to the array length.
            int numOfZero = arr.length - countOne - start;

            // If there are no one.
            if (start == -1) {
                System.out.println(res);
            } else {
                while (numOfZero > 0) {
                    while (arr[end] != '0' && end < arr.length) {
                        end++;
                    }

                    res += Math.abs(end - start) + 1;
                    end++;
                    start++;
                    numOfZero--;
                }
                System.out.println(res);
            }
            t--;
        }
        sc.close();
    }
}