class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums1) {
            set.add(i);
        }

        HashSet<Integer> resSet = new HashSet<>();
        for(int i: nums2) {
            if(set.contains(i)) {
                resSet.add(i);
            }
        }

        int[] res = new int[resSet.size()];
        int i = 0;
        for(int x: resSet) {
            res[i] = x;
            i++;
        }

        return res;
    }
}