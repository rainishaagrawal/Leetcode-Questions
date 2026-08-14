class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff1 = nums[i] - k;
            int diff2 = nums[i] + k;
            if (map.containsKey(diff1)) {
                count += map.get(diff1);
            }
            if (map.containsKey(diff2)) {
                count += map.get(diff2);
            }
        }
        return count / 2;
    }
}