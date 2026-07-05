class Solution {
    public int subarraySum(int[] nums, int k) {
        long pref = 0;
        int count = 0;

        HashMap<Long, Integer> freq = new HashMap<>();
        freq.put(pref, 1);

        for(int i: nums) {
            pref += i;
            long need = pref - k;

            if(freq.containsKey(need)) {
                count += freq.get(need);
            }
            
            freq.put(pref, freq.getOrDefault(pref, 0)+1);
        }

        return count;
    }
}