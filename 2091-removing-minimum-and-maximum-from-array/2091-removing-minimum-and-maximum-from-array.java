class Solution {
    public int minimumDeletions(int[] nums) {
        int m=nums[0];
        int mi=0;
        int l=nums[0];
        int li=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
                mi=i;
            }
            if(nums[i]<l){
                l=nums[i];
                li=i;
            }
        }
        int left = Math.min(mi, li);
        int right = Math.max(mi, li);
        int n = nums.length;
        int rf = right + 1;
        int re = n - left;
        int both= (left + 1) + (n - right);
        return Math.min(rf, Math.min(re,both));
    }
}