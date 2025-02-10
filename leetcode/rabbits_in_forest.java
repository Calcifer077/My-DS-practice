import java.util.*;

public class rabbits_in_forest {
    public static int numRabbits(int[] answers) {
        // In this question we have to count how many total rabbits are there.
        // Each rabbit tells that there are 'n' number of more rabbits of same color as
        // me.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            // Creating pairs of colors.
            map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
        }

        int res = 0;

        // Below take into consideration of the rabbit who is ansering also.
        for (int i : map.keySet()) {
            int a = (map.get(i) + i) / (i + 1);
            res += a * (i + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int answers[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        System.out.println(numRabbits(answers));
    }
}
