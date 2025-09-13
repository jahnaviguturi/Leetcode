class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int res=0;
        int major=0;
        
        for(int i: nums){
            mp.put(i,1+mp.getOrDefault(i,0));
            if(mp.get(i)>major){
                res=i;
                major=mp.get(i);
            }
        }
        return res;
    }
}