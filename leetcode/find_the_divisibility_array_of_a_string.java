package leetcode;

public class find_the_divisibility_array_of_a_string {
    public static int[] divisibilityArray(String word, int m) {
        int res[] = new int[word.length()];

        long num = 0;
        for (int i = 0; i < word.length(); i++) {
            num = num * 10 + (word.charAt(i) - '0');
            if (num % m == 0)
                res[i] = 1;
            else
                res[i] = 0;

            num %= m;
        }

        return res;
    }

    public static void main(String[] args) {
        String word = "52928";
        int m = 4;
        System.out.println(divisibilityArray(word, m));
    }
}
