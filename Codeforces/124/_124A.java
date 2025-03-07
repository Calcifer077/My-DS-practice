// Will give TLE. Instead did in CPP.

// The number of positions

import java.util.*;

public class _124A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // There will be atleast 'a' people in front of him.
        int a = sc.nextInt();

        // There are atmost 'b' people beside him in the line.
        int b = sc.nextInt();

        // It means that he is between 'a' and 'b'. Position in 'a' are inaccessible to
        // him and the positions after him are accessbile to him upto a certain index as
        // people in front of him is atleast there can be more than that.

        // Why b + 1, because at most 'b' and he also have a position to stand in the
        // line.
        System.out.println(Math.min(n - a, b + 1));
        sc.close();
    }
}