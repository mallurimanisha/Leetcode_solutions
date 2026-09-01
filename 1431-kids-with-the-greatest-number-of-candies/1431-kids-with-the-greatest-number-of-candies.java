class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]) max=candies[i];
        }
        List<Boolean> b=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
           b.add(candies[i]+extraCandies>=max);
        }
        return b;
    }
}