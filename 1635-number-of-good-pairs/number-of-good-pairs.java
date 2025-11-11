class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        int[] count = new int[101];
        for(int n:nums){
            count[n]++;
        }
        for(int i=0;i<101;i++){
c+=((count[i])*(count[i]-1))/2;
        }
        return c;
    }
}