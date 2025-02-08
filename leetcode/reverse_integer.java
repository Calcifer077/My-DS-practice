public class reverse_integer {
    public static int reverse(int x) {
        long ans = 0;

        // Making the number positive.
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = x * -1;
        }

        long temp = x;
        while (temp > 0) {
            long a = temp % 10;
            ans += a;
            ans *= 10;
            temp /= 10;
            // If number goes out of bound we will return 0.
            // Why are we not checking out of bound for negative number because we have
            // converted number to positive in the above 'if' condition.
            if (ans > Integer.MAX_VALUE) {
                return 0;
            }
        }

        // Conveting number back to its original sign.
        return (int) ans * sign;
    }
}
