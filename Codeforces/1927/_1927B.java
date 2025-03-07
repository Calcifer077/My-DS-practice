// Following the string

import java.util.*;

public class _1927B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Creating a array for characters.
            int ch[] = new int[26];
            StringBuilder sb = new StringBuilder();

            // '+ 97' is for converting into character.

            // Suppose arr[i] = 1 then we have to append whose current is 1 meaning that it
            // have been appended into the result earlier on.

            // If a character has been appended earlier on then we have already incremented
            // its counter when going through the character array for the very first time.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 26; j++) {
                    if (ch[j] == arr[i]) {
                        // Appending the character which meet the particular crieteria.
                        sb.append(Character.toString(j + 97));
                        // Incremeting value for that particular character.
                        ch[j]++;
                        break;
                    }
                }
            }

            System.out.println(sb);

            t--;
        }
        sc.close();
    }
}