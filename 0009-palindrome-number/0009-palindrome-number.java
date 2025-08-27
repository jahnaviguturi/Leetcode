class Solution {
    public boolean isPalindrome(int x) {
        int temp;
	    if(x<0){
            return false;
        }else{
            temp=x;
        }
        int rev=0;
        while(temp>0){
            int last=temp%10;
            temp=temp/10;
            if(rev>Integer.MAX_VALUE/10 || (rev>Integer.MAX_VALUE/10 && last>7))
            rev=0;
            rev=rev*10+last;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}