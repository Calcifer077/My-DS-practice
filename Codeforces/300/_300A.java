// Array

import java.util.*;

public class _300A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a == 0) {
                zero.add(a);
            } else if (a < 0) {
                negative.add(a);
            } else {
                positive.add(a);
            }
        }

        if (positive.size() > 0) {
            System.out.print(1 + " ");
            System.out.print(negative.get(0));

            System.out.println();

            System.out.print(1 + " ");
            System.out.print(positive.get(0) + " ");

            System.out.println();

            System.out.print((positive.size() + negative.size() + zero.size() - 2) + " ");

            for (int i = 1; i < negative.size(); i++) {
                System.out.print(negative.get(i) + " ");
            }
            for (int i = 1; i < positive.size(); i++) {
                System.out.print(positive.get(i) + " ");
            }
            for (int i = 0; i < zero.size(); i++) {
                System.out.print(zero.get(i) + " ");
            }
        } else {

            System.out.print(1 + " ");
            System.out.print(negative.get(0));

            System.out.println();
            System.out.print(2 + " ");
            System.out.print(negative.get(1) + " " + negative.get(2));
            System.out.println();
            System.out.print((negative.size() - 3 + positive.size() + zero.size()) + " ");

            for (int i = 3; i < negative.size(); i++) {
                System.out.print(negative.get(i) + " ");
            }
            for (int i = 0; i < positive.size(); i++) {
                System.out.print(positive.size() + " ");
            }
            for (int i = 0; i < zero.size(); i++) {
                System.out.print(zero.get(i) + " ");
            }
        }
        sc.close();
    }
}