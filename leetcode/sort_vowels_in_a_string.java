import java.util.ArrayList;
import java.util.Collections;

public class sort_vowels_in_a_string {
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }
        return false;
    }

    public static String sortVowels(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();

        // It will store position of all vowels
        ArrayList<Integer> pos = new ArrayList<>();

        // It will store ascii characters of all vowels
        ArrayList<Integer> vowels = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isVowel(ch[i])) {
                pos.add(i);

                // Adding ascii of vowels
                vowels.add((int) ch[i]);
            }
        }

        // Sorting vowels by their ascii code
        Collections.sort(vowels);

        for (int i = 0; i < pos.size(); i++) {
            // Converting ascii back to character
            ch[pos.get(i)] = (char) vowels.get(i).intValue();
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
}
