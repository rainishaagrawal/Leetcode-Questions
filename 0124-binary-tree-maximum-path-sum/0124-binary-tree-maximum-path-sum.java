class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return ans;
    }
    public int solve(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        int curr = root.val + left + right;
        ans = Math.max(ans, curr);
        return root.val + Math.max(left, right);
    }
}