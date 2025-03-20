public class maximum_points_you_can_obtain_from_cards {
    public static int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int totalSum = 0;

        // Calculate total sum of all card points
        for (int point : cardPoints) {
            totalSum += point;
        }

        // If we can take all the elements.
        if (k == n) {
            return totalSum;
        }

        // Find the minimum subarray sum of length n - k
        int windowSize = n - k;
        int minSubarraySum = 0;

        // Calculate the sum of the initial window
        for (int i = 0; i < windowSize; i++) {
            minSubarraySum += cardPoints[i];
        }

        int currentSum = minSubarraySum;
        for (int i = windowSize; i < n; i++) {
            // Slide the window to the right by adding the next element
            // and subtracting the element that is left behind
            currentSum += cardPoints[i] - cardPoints[i - windowSize];
            minSubarraySum = Math.min(minSubarraySum, currentSum);
        }

        // Maximum score is total sum minus the minimum subarray sum
        return totalSum - minSubarraySum;
    }

    public static void main(String[] args) {

    }
}