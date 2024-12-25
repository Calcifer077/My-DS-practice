package CodeChef;

import java.util.*;

public class merry_christmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int res = 0;

        boolean a = false;
        boolean b = false;
        boolean c = false;
        while (t > 0) {
            if (t > 3 && !a) {
                res++;
                t -= 4;
                a = true;
            } else if (t > 2 && !b) {
                res++;
                t -= 2;
                b = true;
            } else if (!c) {
                res++;
                t -= 1;
                c = true;
            } else {
                break;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
