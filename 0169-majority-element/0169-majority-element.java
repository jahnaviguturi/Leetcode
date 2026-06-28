class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int value: nums) {
            freq.put(value, freq.getOrDefault(value, 0)+1);
        }

        for(int key: freq.keySet()) {
            if(freq.get(key) > n/2) {
                return key;
            }
        }

        return -1;
    }
}