public class reverse_vowels_of_a_string {
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;

        String vowels = "aeiouAEIOU";

        char c[] = s.toCharArray();
        while (start < end) {
            while (start < end && vowels.indexOf(c[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(c[end]) == -1) {
                end--;
            }

            char ch = c[start];
            c[start] = c[end];
            c[end] = ch;

            start++;
            end--;
        }

        return new String(c);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
