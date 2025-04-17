// Powering the Hero (easy version)

import java.util.*;

public class _1800C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            long sum = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                if (a > 0) {
                    list.add(a);
                } else {
                    if (list.size() > 0) {
                        Collections.sort(list);
                        sum += list.get(list.size() - 1);
                        list.remove(list.size() - 1);
                    }
                }
            }

            System.out.println(sum);
        }
        sc.close();
    }
}