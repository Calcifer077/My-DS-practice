// Forked

import java.util.*;

public class _1904A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xk = sc.nextInt();
            int yk = sc.nextInt();

            int xq = sc.nextInt();
            int yq = sc.nextInt();

            int p1[] = new int[16];
            int p2[] = new int[16];

            HashSet<String> map = new HashSet<>();
            p1[0] = xk + a;
            p1[1] = yk + b;
            p1[2] = xk + a;
            p1[3] = yk - b;
            p1[4] = xk + b;
            p1[5] = yk + a;
            p1[6] = xk + b;
            p1[7] = yk - a;
            p1[8] = xk - a;
            p1[9] = yk + b;
            p1[10] = xk - b;
            p1[11] = yk + a;
            p1[12] = xk - a;
            p1[13] = yk - b;
            p1[14] = xk - b;
            p1[15] = yk - a;

            for (int i = 0; i < 16; i += 2) {
                String s = p1[i] + " " + p1[i + 1];
                map.add(s);
            }

            p2[0] = xq + a;
            p2[1] = yq + b;
            p2[2] = xq + a;
            p2[3] = yq - b;
            p2[4] = xq + b;
            p2[5] = yq + a;
            p2[6] = xq + b;
            p2[7] = yq - a;
            p2[8] = xq - a;
            p2[9] = yq + b;
            p2[10] = xq - b;
            p2[11] = yq + a;
            p2[12] = xq - a;
            p2[13] = yq - b;
            p2[14] = xq - b;
            p2[15] = yq - a;

            long res = 0;

            for (int i = 0; i < 16; i += 2) {
                String s = p2[i] + " " + p2[i + 1];
                if (map.contains(s)) {
                    map.remove(s);
                    res++;
                }
            }

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}