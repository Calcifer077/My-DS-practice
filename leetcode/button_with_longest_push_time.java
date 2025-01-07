package leetcode;

class button_with_longest_push_time {
    public static int buttonWithLongestTime(int[][] events) {
        int res = events[0][0];

        int max = events[0][1];
        for (int i = 1; i < events.length; i++) {
            if ((events[i][1] - events[i - 1][1] > max)
                    || (events[i][1] - events[i - 1][1] == max && events[i][0] < res)) {
                max = events[i][1] - events[i - 1][1];
                res = events[i][0];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int events[][] = { { 1, 4 }, { 18, 5 }, { 15, 7 }, { 12, 9 }, { 1, 11 }, { 18, 13 }, { 16, 17 } };
        System.out.println(buttonWithLongestTime(events));
    }

}