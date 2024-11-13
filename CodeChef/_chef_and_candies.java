package CodeChef;

import java.util.Scanner;

public class _chef_and_candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x >= n) {
                System.out.println(0);
            } else {
                int diff = n - x;
                if (diff % 4 == 0) {
                    System.out.println(diff / 4);
                } else {
                    System.out.println((diff / 4) + 1);
                }
            }
            t--;
        }
        sc.close();
    }
}