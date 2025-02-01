// Game with sticks

import java.util.*;

public class _451A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int count = 1;
        boolean flag = false;
        // 'm * n' is the total number of intersections.
        // After each turn numbe of sticks decreases by 2. 1 for 'm' and 1 for 'n'
        // making number of intersections less.
        // If interesections become zero, then the last guy to remove the stick wins.
        while (m * n > 0) {
            if (count % 2 == 1) {
                flag = true;
            } else {
                flag = false;
            }
            count++;
            m--;
            n--;
        }

        if (flag) {
            System.out.println("Akshat");
        } else {
            System.out.println("Malvika");
        }
        sc.close();
    }
}