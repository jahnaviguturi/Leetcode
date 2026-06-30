class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i <= s.length()-1; i++) {
            for(int j = i; j <= s.length()-1; j++) {
                if(isPalindrome(s, i, j)) {
                    int curLength = j - i + 1;
                    if(curLength > res.length()) {
                        res = s.substring(i, j+1);
                    }
                }
            }
        }

        return res;
    }

    public static boolean isPalindrome(String str, int low, int high) {
        while(low < high) {
            if(str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}