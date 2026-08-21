class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        while(n!=1 && !h.contains(n)){
            h.add(n);
            int s=0;
            while(n>0){
                s+=(n%10)*(n%10);
                n/=10;
            }
            n=s;
        }
        return n==1;
    }
}