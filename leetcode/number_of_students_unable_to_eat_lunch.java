
import java.util.*;

public class number_of_students_unable_to_eat_lunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        // Brute force
        /*
         * 
         * Stack<Integer> st = new Stack<>();
         * for (int i = sandwiches.length - 1; i >= 0; i--) {
         * st.push(sandwiches[i]);
         * }
         * 
         * Queue<Integer> q = new LinkedList();
         * for (int i = 0; i < students.length; i++) {
         * q.add(students[i]);
         * }
         * 
         * int count = 0;
         * while (!st.empty()) {
         * if (q.peek() == st.peek()) {
         * st.pop();
         * q.remove();
         * count = 0;
         * } else {
         * q.add(q.remove());
         * count++;
         * }
         * 
         * if (count == q.size()) {
         * break;
         * }
         * }
         * 
         * return q.size();
         */

        // Somewhat optimized

        int ones = 0;
        int zeroes = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                zeroes++;
            } else {
                ones++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0) {
                if (zeroes == 0)
                    return ones;
                else
                    zeroes--;

            } else {
                if (ones == 0)
                    return zeroes;
                else {
                    ones--;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int students[] = { 1, 1, 1, 0, 0, 1 };
        int sandwiches[] = { 1, 0, 0, 0, 1, 1 };

        System.out.println(countStudents(students, sandwiches));
    }
}
