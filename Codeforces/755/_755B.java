// PolandBall and Game

import java.util.*;

public class _755B {
    public static void main(String[] args) {
        // What I have done is
        // A word can repeat atmost two times, if we consider both players words as they
        // will be unique in their own list of words.
        // So most optimal way would be to first say the word which is also present in
        // other players word list, so that the other player will have less word to say.
        // whichever runs out of words in this way loses.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int poland = 0;
        int enemy = 0;
        int both = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            set.add(s);
        }
        poland = n;

        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if (set.contains(s)) {
                both++;
                poland--;
            } else {
                enemy++;
            }
        }

        boolean flag = false;
        boolean polandTurn = true;
        while (true) {
            if (polandTurn) {
                if (both > 0) {
                    both--;
                } else if (poland > 0) {
                    poland--;
                } else {
                    flag = false;
                    break;
                }
                polandTurn = false;
            } else {
                if (both > 0) {
                    both--;
                } else if (enemy > 0) {
                    enemy--;
                } else {
                    flag = true;
                    break;
                }

                polandTurn = true;
            }
        }

        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}