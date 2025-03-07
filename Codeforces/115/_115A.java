import java.util.*;

public class _115A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            int x = arr[i];
            while (x != -1) {
                x = arr[x];
                count++;
            }

            ans = Math.max(count, ans);
        }

        System.out.println(ans + 1);

        sc.close();
    }
}