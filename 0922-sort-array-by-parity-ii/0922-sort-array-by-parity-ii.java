class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        int e = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans[i] = even.get(e);
                e++;
            } else {
                ans[i] = odd.get(o);
                o++;
            }
        }
        return ans;
    }
}