
public class lemondae_change {
    public static boolean solve(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                ten++;
                if (five > 0) {
                    five--;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                twenty++;
                if (ten > 0 && five > 0) {
                    ten -= 1;
                    five -= 1;
                } else if (five > 2) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int bills[] = { 5, 5, 10, 10, 20 };
        System.out.println(solve(bills));
    }
}
