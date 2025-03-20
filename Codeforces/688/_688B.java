// Lovely Palindromes

import java.util.*;

public class _688B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        System.out.print(sb);
        System.out.print(sb.reverse());
        sc.close();
    }
}