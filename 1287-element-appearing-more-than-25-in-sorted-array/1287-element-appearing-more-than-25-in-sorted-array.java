class Solution {
    public int findSpecialInteger(int[] arr) {
        int l=arr.length;
        if(l==1) return arr[0];
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) c++;
            else if(c>l/4) return arr[i-1];
            else c=1;
        }
        return arr[l-1];
    }
}