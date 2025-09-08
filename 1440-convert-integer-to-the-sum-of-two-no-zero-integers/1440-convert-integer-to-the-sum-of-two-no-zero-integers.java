class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        for(int i=1;i<n;i++){
            int j=n-i;
            if(!String.valueOf(i).contains("0")&&!String.valueOf(j).contains("0")){
                res[0]=i;
                res[1]=j;
            }
            
        }
        return res;
    }
}