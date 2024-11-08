class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] answer = new int[nums.length];
        int xorAll = 0;
        
        for (int i =0;i<nums.length;i++) {
            xorAll ^= nums[i];
        }

      
        int maxXorValue = (1 << maximumBit) - 1; 


        for (int i = 0; i < nums.length; i++) {
            answer[i] = xorAll ^ maxXorValue;
            xorAll ^= nums[nums.length - 1 - i]; 
        }

        return answer;
    }
}
