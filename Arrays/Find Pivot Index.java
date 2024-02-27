public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int cumSum = 0;
        int n = nums.length;

        for (int num: nums) {
            totalSum += num;
        }

        for (int i = 0; i < n; ++i) {
            int leftSum = cumSum;
            int rightSum = totalSum - cumSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }

            cumSum += nums[i];
        }

        return -1;
    }
} {
    
}
