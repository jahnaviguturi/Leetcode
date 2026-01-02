class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap();

        for(int x: nums) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        for(int k: cnt.keySet())
            if(cnt.get(k) > 1)
                return k;

        throw null;
    }
}