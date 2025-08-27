import java.util.*;

public class make_cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean c = false;
        boolean a = false;
        boolean t = false;

        for (char x : s.toCharArray()) {
            if (x == 'c')
                c = true;

            if (x == 'a')
                a = true;

            if (x == 't')
                t = true;
        }

        if (c && a && t)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}