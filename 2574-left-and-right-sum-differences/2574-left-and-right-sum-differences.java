class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i <= nums.length-1; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;
        int res[] = new int[nums.length];
        for(int i = 0; i <= nums.length-1; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            res[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return res;
    }
}