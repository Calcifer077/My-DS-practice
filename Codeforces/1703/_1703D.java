// Double strings

import java.util.*;

public class _1703D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            String str[] = new String[n];
            Map<String, Boolean> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
                mp.put(str[i], true);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < str[i].length(); j++) {
                    if (mp.containsKey(str[i].substring(0, j)) && mp.containsKey(str[i].substring(j))) {
                        arr[i] = 1;
                        break;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}