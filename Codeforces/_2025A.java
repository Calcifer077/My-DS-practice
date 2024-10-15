import java.util.*;

public class _2025A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            int count = 0;
            int i = 0;
            int j = 0;
            for (i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }

            int res = 0;
            if (count > 0) {
                res += count + 1 + (str1.length() - count) + (str2.length() - count);
            } else {
                res += str1.length() + str2.length();
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}