// Farmer John's Card Game

import java.util.*;

public class _2060B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<HashSet<Integer>> sets = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                sets.add(new HashSet<>());
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();

                    sets.get(i).add(x);
                }
            }

            boolean flag = true;
            int res[] = new int[n];
            // res[0] = pos;
            int count = 0;
            while (count < n * m) {
                for (int i = 0; i < n; i++) {
                    if (sets.get(i).contains(count)) {

                        if (count < n) {
                            res[count] = i + 1;
                        } else {
                            int a = count % n;
                            if (sets.get(i).contains(a) == false) {
                                flag = false;
                                break;
                            }
                        }
                    }

                    if (!flag)
                        break;
                }
                count++;
            }

            if (flag) {
                for (int i = 0; i < res.length; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }

            t--;
        }
        sc.close();
    }
}