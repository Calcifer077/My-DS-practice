package CodeChef;

import java.util.*;

public class movie_snacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x + y > z) {
            System.out.println((2 * z) + y);
        } else {
            System.out.println(2 * (x + y) + y);
        }

        sc.close();
    }
}
