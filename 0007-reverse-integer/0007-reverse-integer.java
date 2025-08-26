class Solution {
    public int reverse(int x) {
        int temp;
	    if(x<0){
            temp=x*-1;
        }else{
            temp=x;
        }
        int rev=0;
        while(temp>0){
            int last=temp%10;
            temp=temp/10;
            if(rev>Integer.MAX_VALUE/10 || (rev>Integer.MAX_VALUE/10 && last>7))
            return 0;
            rev=rev*10+last;
        }
        if(x<0){
            return rev*-1;
        }
        else{
            return rev;
        }
    }
}