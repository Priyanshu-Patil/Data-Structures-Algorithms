class NumArray {
    int[] preSum;

    public NumArray(int[] nums) {

        preSum = new int[nums.length]; 

        for (int i = 0; i < nums.length; ++i) {

            if (i == 0) {
                preSum[0] = nums[0];
            } else {
                preSum[i] = nums[i] + preSum[i - 1];
            }
        } 
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return preSum[right];
        }

        return preSum[right] - preSum[left - 1];
    }
}