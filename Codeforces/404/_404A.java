// Valera and X

import java.util.*;

public class _404A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                set.add(s[i].charAt(j));
            }
        }

        // If there are more than 2 characters or less than 2 characters
        if (set.size() != 2) {
            System.out.println("NO");
        } else {
            int count = 0;
            // Every character on diagnol should be equal to this one.
            char a = s[0].charAt(0);

            boolean flag = true;
            boolean change = false;

            int start = 0;
            int end = n - 1;

            while (count < n) {
                for (int j = 0; j < s[count].length(); j++) {
                    if (j == start) {
                        if (s[count].charAt(start) != a) {
                            flag = false;
                            break;
                        }
                    } else if (j == end) {
                        if (s[count].charAt(end) != a) {
                            flag = false;
                            break;
                        }
                    } else {
                        if (s[count].charAt(j) == a) {
                            flag = false;
                            break;
                        }
                    }
                }

                // If we are at the mid element.
                if (start == end) {
                    change = true;
                }

                // We are below the mid element, decrease start and increase end
                if (change) {
                    start--;
                    end++;

                    // We are above the mid element, increase start and decrease end
                } else {
                    start++;
                    end--;
                }
                count++;
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}