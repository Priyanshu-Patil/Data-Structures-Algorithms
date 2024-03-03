class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] ans = new int[nums.length];
       int i,j;

       for(i = 0; i < nums.length; ++i) {
           int count = 0;
           
           for (j = 0; j < nums.length; ++j) {
               if (nums[j] < nums[i]) {
                   count++;
                   ans[i] = count;
               }
           }
       } 

       return ans;
    }
}