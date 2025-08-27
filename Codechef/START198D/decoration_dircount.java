import java.util.*;

public class decoration_dircount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                int curr = arr[i];
                curr += arr[i + 1] / 2;

                min = Math.min(min, curr);
            }

            Arrays.sort(arr);

            min = Math.min(min, arr[0] + arr[1]);

            System.out.println(min);
        }
        sc.close();
    }
}