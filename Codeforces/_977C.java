// Less or Equal

import java.util.*;

public class _977C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        // If 'n' is equal to 'k' then last element is the answer.
        // Why?
        // Beacause there will be 'n' or 'k' elements that will be less than or equal to
        // last element which is what is needed in the question.
        if (n == k) {
            System.out.println(arr[n - 1]);

            // It means that there should be no element smaller than 'x' from the given
            // array.
            // If the smallest element we can return is less than 1 then return -1 else
            // return that number
        } else if (k == 0) {
            int s = arr[0] - 1;
            System.out.println(s > 0 ? s : -1);

        } else if (arr[k] == arr[k - 1]) {
            // If the kth element is equal to k-1 element then answer won't exist because
            // for that particular element we will get +1 in result.
            // Suppose our array is
            // 1 3 3 5 5 10 20 and k is 4

            // We reach 4 element at arr[3], so '5' should be answer but there is another 5
            // present after it. If we return 5, then there will be 5 elements less than
            // equal to x. Also true for 6.
            System.out.println(-1);

        } else {
            System.out.println(arr[k - 1]);
        }
        sc.close();
    }
}