class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] ans = new int[n];
        ans[0] = nums[0];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != ans[j]) {
                j++;
                ans[j] = nums[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            nums[i] = ans[i];
        }
        return j + 1;
    }
}