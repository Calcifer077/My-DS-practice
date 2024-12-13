// Alyona and a Square Jigsaw Puzzle

import java.util.*;

public class _2047A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            float sum = 0;
            int happy = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];

                if (Math.sqrt(sum) % 2 == 1) {
                    happy++;
                }

            }

            System.out.println(happy);

            t--;
        }
        sc.close();
    }
}