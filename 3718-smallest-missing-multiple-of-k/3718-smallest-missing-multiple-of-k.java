class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length;
        int f=k;
        for(int i=0;i<l;i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]%k==0){
                if(nums[i]!=f) return f;
                else f+=k;
            }
        }
        return f;
    }
}