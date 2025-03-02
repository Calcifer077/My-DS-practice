import java.util.*;

public class asteroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for (int i = 0; i < n; i++) {
            st.push(asteroids[i]);
        }

        // This will store the answer.
        List<Integer> res = new ArrayList<>();
        int a = 0;
        while (!st.isEmpty()) {
            // If we have already removed a element we will do comparisions with that
            // element. If we have not done any removal then we will compare with top of
            // stack.
            if (res.size() > 0) {
                a = res.get(res.size() - 1);
            } else {
                a = st.pop();
                res.add(a);
            }

            // If the element we removed is the last one then break
            if (st.isEmpty()) {
                break;
            }

            // If the element we just popped is positive, then it won't have any effect over
            // the result, as positive goes in right direction so it won't be affected by
            // other positive elements. Ans negative elements go in left direction so that
            // also will have no effect.
            if (a > 0) {
                res.add(st.pop());
            } else {
                int b = st.pop();
                // Convert negative to positive as we will do comparisons.
                a = -1 * a;

                if (b > 0) {
                    // If they are equal then we remove both of them from our result. 'b' is not
                    // added to 'res' but it was popped so it doesn't exist anywhere. 'a' is the
                    // latest element we added in 'res' so it will be atlast, remove it.
                    if (a == b) {
                        res.remove(res.size() - 1);
                    } else {
                        if (a > b) {
                            st.push(-1 * a);
                        } else {
                            st.push(b);
                        }
                        res.remove(res.size() - 1);
                    }
                } else {
                    res.add(b);
                }
            }
        }

        n = res.size();
        int arr[] = new int[n];

        Collections.reverse(res);

        for (int i = 0; i < n; i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}