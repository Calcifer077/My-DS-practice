
import java.util.HashMap;

public class isomorphic_strings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> a = new HashMap<>();
        HashMap<Character, Character> b = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (a.containsKey(sc)) {
                if (a.get(sc) != tc) {
                    return false;
                }
            } else {
                a.put(sc, tc);
            }

            if (b.containsKey(tc)) {
                if (b.get(tc) != sc) {
                    return false;
                }
            } else {
                b.put(tc, sc);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
