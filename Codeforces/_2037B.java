// Intercepted Inputs

import java.util.*;

public class _2037B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            int helperVar = n - 2;

            for (int i = 1; i * i <= helperVar; i++) {
                if (helperVar % i == 0 && set.contains(i) && set.contains(helperVar / i)) {
                    System.out.println(i + " " + helperVar / i);
                    break;
                }
            }

            t--;
        }
        sc.close();
    }
}