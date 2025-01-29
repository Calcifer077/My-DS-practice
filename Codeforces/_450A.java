// Jzzhu and Children

import java.util.*;

public class _450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // As we have to return the index of the last kid we will use a queue which will
        // store index of each kid.
        Queue<Integer> q = new LinkedList<>();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            q.add(i);
        }

        int res = 0;
        while (!q.isEmpty()) {
            // returns head of queue, if queue is empty returns null.
            // removes first element from the queue
            int index = q.poll();
            res = index;

            // Only add index again to queue, if arr[index] is more than m.
            // Before adding decrement value at index by 'm'.
            if (arr[index] > m) {
                arr[index] -= m;
                q.add(index);
            }
        }

        // As kids are not 0-indexed but 1-indexed.
        System.out.println(res + 1);

        sc.close();
    }
}