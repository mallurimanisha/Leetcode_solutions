class Solution {
    public boolean checkDivisibility(int n) {
        if(n==0) return false;
        int s=1;
        int t=n;
        int d=0;
        while(t>0){
            d+=t%10;
            s*=t%10;
            t/=10;
        }
        d+=s;
        if(d==0) return false;
        return n%d==0;
    }
}