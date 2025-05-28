// Shoe Shuffling

import java.util.*;

public class _1691B {
    public static void main(String[] args) {
        // Problem asks us to suhffle the shoes in a way that each student gets a shoe
        // that is either larger than their own or equal to their own.

        // Starting from index 0 if you were to give it a shoe that is larger than its
        // own than it is not possible for anyone else to use this shoe (because it will
        // be smaller for them), so our best try will be shuffle shoe among student who
        // have the same shoe size.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, List<Integer>> map = new HashMap<>();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (map.containsKey(arr[i])) {
                    map.get(arr[i]).add(i + 1);
                } else {
                    List<Integer> list = new ArrayList<>();
                    map.put(arr[i], list);
                    map.get(arr[i]).add(i + 1);
                }
            }

            boolean flag = true;
            int res[] = new int[n];
            int count = 1;

            for (int i = 0; i < n; i++) {
                if (map.get(arr[i]).size() == 1) {
                    flag = false;
                    break;
                } else {
                    if (map.get(arr[i]).get(0) == (i + 1)) {
                        res[i] = map.get(arr[i]).get(map.get(arr[i]).size() - 1);
                    } else {
                        res[i] = map.get(arr[i]).get(count - 1);
                        count++;
                    }
                }

                if (count == map.get(arr[i]).size()) {
                    count = 1;
                }
            }

            if (flag) {
                for (int i = 0; i < n; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }

        }
        sc.close();
    }
}