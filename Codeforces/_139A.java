// Petr and book

import java.util.*;

public class _139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while (true) {
            n -= arr[i];

            if (n <= 0) {
                System.out.println(i + 1);
                break;
            }

            i++;
            if (i == 7) {
                i = 0;
            }
        }
        sc.close();
    }
}