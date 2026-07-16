class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(nums, maxOperations, mid)) {
                ans = mid;
                high = mid - 1;   
            } else {
                low = mid + 1;   
            }
        }
        return ans;
    }
    private boolean canMake(int[] nums, int maxOperations, int penalty) {
        long operations = 0;
        for (int num : nums) {
            operations += (num - 1) / penalty;
            if (operations > maxOperations) {
                return false;
            }
        }
        return true;
    }
}