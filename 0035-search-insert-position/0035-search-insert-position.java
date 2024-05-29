class Solution {
    public int searchInsert(int[] nums, int target) {
        int startind = 0;
        int endind = nums.length - 1;
        
        while (startind <= endind) {
            int mid = startind + (endind - startind) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                startind = mid + 1;
            } else {
                endind = mid - 1;
            }
        }
        
        // If we exit the loop, startind is the insertion point
        return startind;
    }
}