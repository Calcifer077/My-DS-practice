// Middle Class

import java.util.*;

public class _1334B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Sorting the array so that we can start seeing elements from the greatest
            // element.
            Arrays.sort(arr);

            double sum = 0;
            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                sum += arr[i];
                double a = sum / (n - i);

                // If the ratio is more than required, then increment count else break the loop
                // because hereforth the elements will only decrease so there is no need to
                // check further.
                if (a >= x) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}