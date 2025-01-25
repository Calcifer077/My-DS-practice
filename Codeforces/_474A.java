// Keyboard

import java.util.*;

public class _474A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String s = sc.next();

        char ch1[] = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
        char ch2[] = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';' };
        char ch3[] = { 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/' };
        if (ch == 'R') {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                boolean flag = false;
                for (int j = 0; j < ch1.length; j++) {
                    if (ch1[j] == c) {
                        System.out.print(ch1[j - 1]);
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    for (int j = 0; j < ch2.length; j++) {
                        if (ch2[j] == c) {
                            System.out.print(ch2[j - 1]);
                            flag = true;
                            break;
                        }
                    }
                }

                if (!flag) {
                    for (int j = 0; j < ch3.length; j++) {
                        if (ch3[j] == c) {
                            System.out.print(ch3[j - 1]);
                            flag = true;
                            break;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                boolean flag = false;
                for (int j = 0; j < ch1.length; j++) {
                    if (ch1[j] == c) {
                        System.out.print(ch1[j + 1]);
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    for (int j = 0; j < ch2.length; j++) {
                        if (ch2[j] == c) {
                            System.out.print(ch2[j + 1]);
                            flag = true;
                            break;
                        }
                    }
                }

                if (!flag) {
                    for (int j = 0; j < ch3.length; j++) {
                        if (ch3[j] == c) {
                            System.out.print(ch3[j + 1]);
                            flag = true;
                            break;
                        }
                    }
                }
            }

        }

        System.err.println();

        sc.close();
    }
}