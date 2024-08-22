class Solution {
    public int findComplement(int num) {
        //return num^num-1;
       
         if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
    }
}