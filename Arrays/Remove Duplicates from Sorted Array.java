//Using Two Pointet Approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        
        while (j < n) {
            //Got the unique element
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

            //to find unique elements
            j++;
        }
        return i + 1;
    }
}