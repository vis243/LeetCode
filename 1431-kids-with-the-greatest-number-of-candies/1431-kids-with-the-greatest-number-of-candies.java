class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> a = new ArrayList<Boolean>();
        int k=0;
        int max=0;
        for(int i=0;i<candies.length;i++)
            max=Math.max(candies[i],max);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                a.add(true);
            else{
                a.add(false);
            }
        }
        return a;
    }
}