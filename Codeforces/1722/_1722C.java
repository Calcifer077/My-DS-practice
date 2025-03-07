// Word game

import java.util.*;

public class _1722C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            HashMap<String, Integer> map = new HashMap<>();

            String str[][] = new String[3][n];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    str[i][j] = sc.next();
                    map.put(str[i][j], map.getOrDefault(str[i][j], 0) + 1);
                }
            }

            for (int i = 0; i < 3; i++) {
                int total = 0;
                for (int j = 0; j < n; j++) {
                    if (map.get(str[i][j]) == 1) {
                        total += 3;
                    } else if (map.get(str[i][j]) == 2) {
                        total += 1;
                    }
                }
                System.out.print(total + " ");
            }

            System.out.println();

            t--;
        }
        sc.close();
    }
}
