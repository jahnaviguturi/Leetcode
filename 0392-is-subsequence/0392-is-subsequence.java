class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i <= s.length()-1 && j <= t.length()-1) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return (i == s.length());
    }
}