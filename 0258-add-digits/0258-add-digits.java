class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10){
            sum=0;
            while(num>0){
                int last=num%10;
                sum+=last;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}