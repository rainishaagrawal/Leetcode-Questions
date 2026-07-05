class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int[] result = new int[n];
        result[0] = sum;
        for(int i = 1; i<n; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}