// Challenging Valleys

import java.util.*;

public class _1760D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (i == 0 || list.get(list.size() - 1) != x) {
                    list.add(x);
                }
            }

            int res = 0;
            for (int i = 0; i < list.size(); i++) {
                if ((i == 0 || list.get(i - 1) > list.get(i))
                        && (i == list.size() - 1 || list.get(i) < list.get(i + 1))) {
                    res++;
                }
            }

            if (res == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}