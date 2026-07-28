class Solution {
    private long countLessOrEqual(int[] nums, int limit) {
        int left = 0;
        int right = nums.length - 1;
        long count = 0;
        while (left < right) {
            if (nums[left] + nums[right] <= limit) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLessOrEqual(nums, upper)
                - countLessOrEqual(nums, lower - 1);
    }
}