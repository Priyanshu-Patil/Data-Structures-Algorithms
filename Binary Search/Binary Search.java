class Solution {
    //Iterative Approach
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

class Solution {
    //Recursive Approach

    int solve(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(nums[mid] == target)
            return mid;
        else if(nums[mid] < target)
            return solve(nums, mid+1, end, target);
        else
            return solve(nums, start, mid-1, target);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;

        return solve(nums, 0, n - 1, target);
    }
}