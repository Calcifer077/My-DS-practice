// Little Artem

import java.util.*;

public class _1333A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if ((m * n) % 2 == 1) {
                boolean flag = true;
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (flag) {
                            System.out.print("B");
                            flag = false;
                        } else {
                            System.out.print("W");
                            flag = true;
                        }
                    }
                    System.out.println();
                }
            } else {
                int size = m * n;
                boolean flag = true;
                for (int i = 0; i < size - 2; i++) {
                    if (flag) {
                        System.out.print("W");
                        flag = false;
                    } else {
                        System.out.print("B");
                        flag = true;
                    }
                    if ((i + 1) % n == 0) {
                        System.out.println();
                    }
                }

                for (int i = size - 2; i < size; i++) {
                    System.out.print("B");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}