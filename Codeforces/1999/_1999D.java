// Slavic's Exam

import java.util.*;

public class _1999D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            String t = sc.next();

            if (t.length() > s.length()) {
                System.out.println("NO");
            } else {
                StringBuilder sb1 = new StringBuilder(s);
                StringBuilder sb2 = new StringBuilder(t);

                int start1 = 0;
                int end1 = sb1.length() - 1;
                int start2 = 0;
                int end2 = sb2.length() - 1;
                int count = 0;

                while (start1 <= end1 && start2 <= end2) {
                    if (sb1.charAt(start1) == sb2.charAt(start2)) {
                        start1++;
                        start2++;
                        count++;
                        continue;
                    }
                    if (sb1.charAt(end1) == sb2.charAt(end2)) {
                        end1--;
                        end2--;
                        count++;
                        continue;
                    }
                    if (sb1.charAt(start1) == '?') {
                        sb1.setCharAt(start1, sb2.charAt(start2));
                        start1++;
                        start2++;
                        count++;
                        continue;
                    }
                    if (sb1.charAt(end1) == '?') {
                        sb1.setCharAt(end1, sb2.charAt(end2));
                        end1--;
                        end2--;
                        count++;
                        continue;
                    }

                    start1++;
                    end1--;

                    if (count == sb2.length()) {
                        break;
                    }
                }

                if (count != sb2.length()) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int i = 0; i < sb1.length(); i++) {
                        if (sb1.charAt(i) == '?') {
                            sb1.setCharAt(i, 'a');
                        }
                    }

                    System.out.println(sb1);
                }

            }

        }
        sc.close();
    }
}