class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> path = new ArrayList<>();

        backtrack(nums, used, path, res);

        return res;
    }

    public static void backtrack(int[] nums, boolean[] used, ArrayList<Integer> path, List<List<Integer>> res) {
        if(path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;

            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, used, path, res);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}