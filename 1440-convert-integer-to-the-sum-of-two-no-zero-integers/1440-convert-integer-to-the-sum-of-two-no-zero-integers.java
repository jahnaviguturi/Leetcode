class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        for(int i=1;i<n;i++){
            int j=n-i;
            if(i>0&&j>0&&isContainsZero(i)==false&&isContainsZero(j)==false){
                res[0]=i;
                res[1]=j;
                break;
            }  
        }
        return res;
    }
    public static boolean isContainsZero(int n){
        while(n>0){
            int temp=n%10;
             if(temp==0){
                return true;
            }
            n=n/10;
        }
        return false;
    }
}