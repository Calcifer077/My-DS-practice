import java.util.*;

public class more_cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int temp = c;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] < temp && !flag) {
                    flag = true;
                } else if (arr[i] >= temp && !flag) {
                    temp = arr[i] + 1;
                    flag = true;
                }

                if (arr[i] == temp) {
                    temp = arr[i] + 1;
                }
            }

            System.out.println(temp - c);
        }
        sc.close();
    }
}