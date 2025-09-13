class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        int vow = 0, con = 0;
        for(char ch='a';ch<='z';ch++){
            if(isVowel(ch)){
                vow = Math.max(vow, mp.getOrDefault(ch,0));
            }else{
                con = Math.max(con, mp.getOrDefault(ch,0));
            }
        }
        return vow + con;
    }

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}