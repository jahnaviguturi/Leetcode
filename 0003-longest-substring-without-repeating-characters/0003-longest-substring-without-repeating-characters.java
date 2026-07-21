class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> visited = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {
            while(visited.contains(s.charAt(right))) {
                visited.remove(s.charAt(left));
                left++;
            }

            visited.add(s.charAt(right));
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}