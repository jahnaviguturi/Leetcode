class Solution {
    public int findMaxLength(int[] nums) {
        int pref = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(pref, -1);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                pref -= 1;
            } else {
                pref += 1;
            }

            if(map.containsKey(pref)) {
                int len = i - map.get(pref);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(pref, i);
            }
        }

        return maxLen;
    }
}