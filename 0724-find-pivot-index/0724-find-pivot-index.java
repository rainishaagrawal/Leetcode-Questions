class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        // Step 1: Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        // Step 2: Traverse array
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            // Check if pivot
            if (leftSum == rightSum) {
                return i;
            }
            // Update leftSum
            leftSum += nums[i];
        }
        return -1;
    }
}