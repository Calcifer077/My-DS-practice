// Bad Prices

import java.util.*;

public class _1213B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // This question asks us if there is a price that is smaller than the current
            // element in the future.
            // Next smaller element.
            // For every element that don't have -1 for them means that there exists a
            // smaller element than them.

            Stack<Integer> st = new Stack<>();
            int ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }

                // Instead of maintaing a seperate array just increment value whenever a
                // non-negative element can come.
                if (!st.isEmpty()) {
                    ans++;
                }

                st.push(i);
            }

            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}