import java.util.*;

public class _1593C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] mice = new int[k];

            for (int i = 0; i < k; i++) {
                mice[i] = sc.nextInt();
            }
            System.out.println(solve(n, mice));
        }

        sc.close();
    }

    public static int solve(int n, int[] mice) {
        Arrays.sort(mice);
        int catsPosition = 0;
        int caughtMice = 0;

        for (int i = mice.length - 1; i >= 0; i--) {
            if (mice[i] > catsPosition) {
                catsPosition += (n - mice[i]);
                caughtMice++;
            } else {
                break;
            }
        }
        return caughtMice;
    }
}