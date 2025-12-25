class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int hapSize = happiness.length;
        Integer[] hapArr = new Integer[hapSize];
        for(int i=0; i < hapSize; i++) {
            hapArr[i] = happiness[i];
        }

        Arrays.sort(hapArr, Collections.reverseOrder());

        long totalHapSum = 0;
        int turns = 0;

        for(int i=0; i<k; i++) {
            totalHapSum += Math.max(hapArr[i] - turns, 0);
            turns++;
        }

        return totalHapSum;
    }
}