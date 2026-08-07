class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int c=n;
            int s=1;
            while(c>0){
                s*=c%10;
                c/=10;
            }
            if(s%t==0) return n;
            n++;
        }
    }
}