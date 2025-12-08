class Solution {
    public int countTriples(int n) {
        int res = 0;
        for(int i = 3; i <= 3*n/4; i++) {
            for(int j = i+1; j < n; j++) {
                int a = i*i + j*j;
                int b = (int)Math.sqrt(a);
                if(b <= n) {
                    if(b*b == a) res +=2;
                } else break;
            }
        }
        return res;
    }
}