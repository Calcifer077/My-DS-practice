// Football

import java.util.*;

public class _43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s1 = "";
        HashMap<String, Integer> map = new HashMap<>();
        String s = sc.next();
        s1 = s;
        map.put(s, 1);

        String s3 = "";
        for (int i = 1; i < n; i++) {
            String s2 = sc.next();
            map.put(s2, map.getOrDefault(s2, 0) + 1);
            if (!s2.equals(s1)) {
                s3 = s2;
            }
        }

        if (map.size() == 1) {
            System.out.println(s1);
        } else {
            if (map.get(s1) > map.get(s3)) {
                System.out.println(s1);
            } else {
                System.out.println(s3);
            }
        }
        sc.close();
    }
}