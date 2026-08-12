class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length; right++) {
            int rightVal = nums[right];
            countMap.put(rightVal, countMap.getOrDefault(rightVal, 0)+1);

            while(countMap.get(rightVal) > k) {
                int leftVal = nums[left];
                countMap.put(leftVal, countMap.get(leftVal)-1);
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}