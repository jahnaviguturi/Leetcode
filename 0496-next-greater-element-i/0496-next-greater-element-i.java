class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length-1; i >= 0; i--) {
            int num = nums2[i];

            while(!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                map.put(num, stack.peek());
            } else {
                map.put(num, -1);
            }

            stack.push(num);
        }

        for(int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}