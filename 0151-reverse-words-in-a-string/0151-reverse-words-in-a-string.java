class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s{2,}"," ");
        String[] arr=s.split(" ");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i]+" ";
        }
        return res.strip();
    }
}