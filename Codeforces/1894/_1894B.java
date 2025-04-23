// Two Out of Three

import java.util.*;

public class _1894B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // According to the question, we need atleast two pair of equal elements to
            // fulfill any two conditions.
            int n = sc.nextInt();
            int arr[] = new int[n];

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int two = 0;
            List<Integer> list = new ArrayList<>();
            for (int i : map.keySet()) {
                if (map.get(i) >= 2) {
                    two++;
                    list.add(i);
                }
            }

            // If there are less than 2 pairs of equal elements than we can' meet the
            // conditions given in the question
            if (two < 2) {
                System.out.println(-1);
            } else {
                // What i have done here is, check if this is the element that have a pair of
                // elements meaning that it comes more than 2 times.

                // If it does than we have to place '1,2,3' according to this element

                // As it is given in the question that we have to fulfill two conditions, the
                // first parir will have '1' and '2', and all the rest of pairs will have '2'
                // and '3'.

                // It doesn't matter what number you assign to the numbers that don't have a
                // pair
                int res[] = new int[n];
                boolean flag[] = new boolean[list.size()];

                for (int i = 0; i < n; i++) {
                    if (list.contains(arr[i])) {
                        int index = list.indexOf(arr[i]);

                        if (!flag[index]) {
                            if (index == 0) {
                                res[i] = 1;
                                flag[index] = true;
                            } else {
                                res[i] = 2;
                                flag[index] = true;
                            }
                        } else {
                            if (index == 0) {
                                res[i] = 2;
                            } else {
                                res[i] = 3;
                            }
                        }
                    } else {

                        res[i] = 3;
                    }
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}