// Dubstep

import java.util.*;

public class _208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String c = s.replaceAll("WUB", " ");

        String ch[] = c.split("\\s+");
        for (int i = 0; i < ch.length; i++) {
            if (!(ch[i].equals(" "))) {
                System.out.print(ch[i] + " ");
            }
        }
        sc.close();
    }
}