class Solution {
    public boolean canSortArray(int[] nums) {
    for(int j = 0;j<nums.length;j++){
      for(int i = 0;i<nums.length-j-1;i++) {
       
        if (nums[i+1] >= nums[i] ){
           continue;
        }
        else{
            if(Integer.bitCount(nums[i+1]) != Integer.bitCount(nums[i])) {
                 return false;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
           
        }
      }
    }
     return true;
    
    }
   public static String decimalToBinaryString(int num) {
    StringBuilder binary = new StringBuilder();

   
    while (num > 0) {
        binary.append(num % 2);
        num = num / 2;
    }

    
    return binary.reverse().toString();
}
public static int countones(String num) {
    int c =0;
    for(int i=0;i<num.length();i++){
        if(num.charAt(i)==1){
            c++;
        }
    }
    return c;
}
}