class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        for(int i=0;i<nums1.length;i++)
            a.add(nums1[i]);
        
        
        
        for(int i=0;i<nums2.length;i++)
            a.add(nums2[i]);
        
        
        Collections.sort(a);
        
        if(a.size()%2==0){
            return (double)(a.get(a.size()/2)+a.get((a.size()/2)-1))/2;
        }
        
        return (double)a.get(a.size()/2);
        
    }
}