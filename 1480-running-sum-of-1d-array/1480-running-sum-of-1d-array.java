class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int total = 0;
        for(int i = 0; i <= nums.length-1; i++) {
            total += nums[i];
            res[i] = total;
        }
        return res;
    }
}