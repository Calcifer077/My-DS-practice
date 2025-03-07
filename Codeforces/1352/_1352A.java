// Sum of round numbers

import java.util.*;

public class _1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            int temp = n;
            int count = 1;
            while (temp > 0) {
                int a = temp % 10;
                if (a != 0) {
                    list.add(a * count);
                }
                count *= 10;
                temp = temp / 10;
            }

            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}