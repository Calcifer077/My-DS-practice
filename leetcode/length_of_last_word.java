
public class length_of_last_word {
    public static int lengthOfLastWord(String s) {

        int pos = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                pos = i;
                break;
            }
        }

        int size = 0;
        for (int i = pos; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                size++;
            } else {
                break;
            }
        }

        return size;
    }

    public static void main(String[] args) {
        String s = "Hello   world    ";
        System.out.println(lengthOfLastWord(s));
    }
}
