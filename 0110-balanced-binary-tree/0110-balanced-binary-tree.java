class Solution {
    public boolean isBalanced(TreeNode root) {
        int diff = solve(root);
        if (diff == -1) {
            return false;
        }
        return true;
    }

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ldata = solve(root.left);
        if (ldata == -1) {
            return -1;
        }
        int rdata = solve(root.right);
        if (rdata == -1) {
            return -1;
        }
        int diff = Math.abs(ldata - rdata);
        if (diff > 1) {
            return -1;
        }
        return Math.max(ldata, rdata) + 1;
    }
}