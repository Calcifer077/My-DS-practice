import java.util.*;

public class group_the_people_given_the_group_size_they_belong_to {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();

        int n = groupSizes.length;

        int arr[][] = new int[n][2];

        // Using hashset so that we can group people in groups. We take out only the
        // groups of people.
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = groupSizes[i];

            set.add(arr[i][1]);
        }

        for (int i : set) {
            // This is the list that will be added in the result.
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                // If the second column(added in first for loop) is equal to current group(for
                // which we are checking right now) add it into list.
                if (arr[j][1] == i) {
                    list.add(arr[j][0]);
                } else {
                    // Simply continue, because we can have people of the same group somewhere down
                    // the line.
                    continue;
                }

                // Because a particular group have a limit after that you have to create a new
                // group for left people.
                if (list.size() == i) {
                    // 'new ArrayList<>()' is the way you can add a new list in 'res'
                    res.add(new ArrayList<>(list));
                    list.clear();
                }
            }

            // Only add non-empty list.
            if (!list.isEmpty()) {
                // Why doing here, outside the loop because there can be some groups who doesn't
                // reach their limit.
                res.add(new ArrayList<>(list));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int groupSizes[] = { 3, 3, 3, 3, 3, 1, 3 };
        System.out.println(groupSizes);

    }
}
