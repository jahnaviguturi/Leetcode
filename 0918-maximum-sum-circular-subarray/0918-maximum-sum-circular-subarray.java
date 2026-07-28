class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int currMin = 0;
        int minSum = nums[0];

        int currMax = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++) {
            currMax = Math.max(nums[i], nums[i]+currMax);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], nums[i]+currMin);
            minSum = Math.min(minSum, currMin);

            totalSum += nums[i];

        }

        if(maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}