class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=arr.length;
        if(l==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        for(int i=1;i<l-1;i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]) return arr[i];
        }
         return arr[l-1];
    }
}