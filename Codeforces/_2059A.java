// Milya and two arrays

import java.util.*;

public class _2059A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }

            int count = 0;
            HashSet<Integer> set = new HashSet<>();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int a = arr1[i] + arr2[j];
                    if (!set.contains(a)) {
                        count++;
                        set.add(a);
                    }

                    if (count >= 3) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}