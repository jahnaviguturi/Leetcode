class Solution {
    public int compress(char[] chars) {
        int write = 0;
        char ch = chars[0];
        int count = 1;

        for(int i = 1; i < chars.length; i++) {
            if(chars[i] == ch) {
                count++;
            } else {
                chars[write++] = ch;
                if(count > 1) {
                   for(char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;
                   }
                }
                ch = chars[i];
                count = 1;
            }
        }

        chars[write++] = ch;
        if(count > 1) {
            for(char c: Integer.toString(count).toCharArray()) {
                chars[write++] = c;
            }
        }

        return write;
    }
}