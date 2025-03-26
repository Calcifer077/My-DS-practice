import java.util.*;

public class _2091B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a >= x) {
                    count++;
                } else {
                    list.add(a);
                }
            }

            Collections.sort(list, Collections.reverseOrder());

            if (list.size() > 0) {
                int min = list.get(0);

                int num = 1;
                for (int i = 1; i < list.size(); i++) {
                    if (min * num >= x) {
                        count++;
                        num = 1;
                    } else {
                        num++;
                    }
                    min = list.get(i);
                }

                if (min * num >= x) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}