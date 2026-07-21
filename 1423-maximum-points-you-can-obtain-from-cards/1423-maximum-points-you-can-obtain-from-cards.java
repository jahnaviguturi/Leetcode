class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int n = cardPoints.length;
        for(int x : cardPoints) {
            totalSum += x;
        }
        if (k == n) return totalSum;

        int windowSize = n - k;
        int windowSum = 0;

        for(int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minSum = windowSum;

        for(int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, windowSum);
        }

        return totalSum - minSum;
    }
}