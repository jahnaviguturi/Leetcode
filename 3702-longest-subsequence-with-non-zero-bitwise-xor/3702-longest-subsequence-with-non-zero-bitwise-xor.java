class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        int n = nums.length;
        boolean isNonZero = false;

        for(int x: nums) {
            isNonZero = isNonZero | x > 0;
            total = total^x;
        }

        if(!isNonZero) {
            return 0;
        }

        total = total==0 ? n - 1 : n;

        return total;
    }
}