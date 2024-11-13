package CodeChef;

import java.util.*;

public class non_matching_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();

            int arr1[] = new int[26];
            int arr2[] = new int[26];

            for (int i = 0; i < n; i++) {
                arr1[str1.charAt(i) - 97] = 1;
            }

            for (int i = 0; i < m; i++) {
                arr2[str2.charAt(i) - 97] = 1;
            }

            boolean res = false;
            for (int i = 0; i < 26; i++) {
                if (arr1[i] == 0 && arr2[i] == 0) {
                    res = true;
                    break;
                }
            }

            if (res) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }
        sc.close();
    }
}
