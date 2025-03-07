// Cypher

import java.util.*;

public class _1703C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                sc.nextInt();
                String str = sc.next();

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == 'D') {
                        if (arr[i] == 9) {
                            arr[i] = 0;
                        } else {
                            arr[i]++;
                        }
                    } else if (str.charAt(j) == 'U') {
                        if (arr[i] == 0) {
                            arr[i] = 9;
                        } else {
                            arr[i]--;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}