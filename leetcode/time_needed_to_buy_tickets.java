public class time_needed_to_buy_tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int res = tickets[k];

        for (int i = 0; i < tickets.length; i++) {
            if (i < k) {
                if (tickets[i] < tickets[k]) {
                    res += tickets[i];
                } else {
                    res += tickets[k];
                }
            } else if (i > k) {
                if (tickets[i] < tickets[k]) {
                    res += tickets[i];
                } else {
                    res += tickets[k] - 1;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int tickets[] = { 5, 1, 1, 1 };
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
