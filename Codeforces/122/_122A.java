// Lucky division

import java.util.*;

public class _122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(47);
        list.add(44);
        list.add(77);
        list.add(74);
        list.add(444);
        list.add(447);
        list.add(474);
        list.add(477);
        list.add(777);
        list.add(774);
        list.add(744);
        list.add(747);

        int n = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (n % list.get(i) == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}