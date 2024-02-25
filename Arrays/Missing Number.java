class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        //case 1
        if (nums[0] != 0) {
            return 0;
        }

        //case 2
        if (nums[n - 1] != n) {
            return n;
        }

        //case 3
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != i) {
                return i;
            }
        }

        return 0;
    }
}git