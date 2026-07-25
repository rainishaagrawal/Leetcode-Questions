class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> d = new ArrayDeque<>();
        int[] ans = new int[n - k + 1];
        if (nums == null || k <= 0) {
            return new int[0];
        }
        for (int i = 0; i < k - 1; i++) {
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.offerLast(i);
        }
        int index = 0;
        for (int i = k - 1; i < n; i++) {
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.offerLast(i);
            while (!d.isEmpty() && d.peekFirst() <= i - k) {
                d.pollFirst();
            }
            ans[index++] = nums[d.peekFirst()];
        }
        return ans;
    }
}