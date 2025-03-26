// Bear and Finding Criminals

import java.util.*;

public class _680B {
    public static void main(String[] args) {
        // Have to find if there exists a criminal from a certain distance from the city
        // where 'limak' is currently present.

        // He will only go to the city if he is sure that criminal exists there
        // irrespective of distance

        // Suppose there is a criminal -1 from 'limak' but not in +1 from 'limak'. He
        // knows that there is a criminal from him at a distance 1 from him but don't
        // know the direction. So he will not do anything.

        // If both -1 and +1 have a criminal in them, then 'limak' is sure that there
        // exists a criminal in both direction, so he can catch both.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < a - 1; i++) {
            left.add(arr[i]);
        }

        for (int i = a; i < n; i++) {
            right.add(arr[i]);
        }

        if (arr[a - 1] == 1) {
            count++;
        }
        Collections.reverse(left);

        if (left.size() <= right.size()) {
            for (int i = 0; i < left.size(); i++) {
                if (left.get(i) == 1 && right.get(i) == 1) {
                    count += 2;
                }
            }

            for (int i = left.size(); i < right.size(); i++) {
                if (right.get(i) == 1) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < right.size(); i++) {
                if (left.get(i) == 1 && right.get(i) == 1) {
                    count += 2;
                }
            }

            for (int i = right.size(); i < left.size(); i++) {
                if (left.get(i) == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}