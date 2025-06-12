// Cool Partition

import java.util.*;

public class _2117C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // How it works is?
            // According to question every successive segment should have all the distinct
            // elements of the preceding segment.

            // So, we create two sets, we start from the first element, and add this element
            // to both the set. If the size of set is equal we increment our count, and
            // clear the second set, this set will now look for more such segments.
            // As the element which is in first segment should also be in the last segment
            // this strategy would work.
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set1.add(arr[i]);
                set2.add(arr[i]);

                if (set1.size() == set2.size()) {
                    count++;
                    set2.clear();
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}