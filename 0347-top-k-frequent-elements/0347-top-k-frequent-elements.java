class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int value: nums) {
            freq.put(value, freq.getOrDefault(value, 0)+1);
        }

        int[] res = new int[k];
        for(int i = 0; i <= k-1; i++) {
            int maxFreq = 0; 
            int maxElement = 0;

            for(int key: freq.keySet()) {
                if(freq.get(key) > maxFreq) {
                    maxFreq = freq.get(key);
                    maxElement = key;
                } else if(freq.get(key) == maxFreq && key < maxElement) {
                    maxElement = key;
                }
            }
            res[i] = maxElement;
            freq.remove(maxElement);
        }
        return res;
    }
}