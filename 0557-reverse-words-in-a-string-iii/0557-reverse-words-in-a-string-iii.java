class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String res="";
        for(int i=0;i<arr.length;i++){
            String word=new StringBuilder(arr[i]).reverse().toString();
            res+=word+" ";
        }
        return res.strip();
    }
}