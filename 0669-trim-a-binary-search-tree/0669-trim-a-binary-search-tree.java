class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return solve(root, low, high);
    }

    public static TreeNode solve(TreeNode root, int l, int r) {

        if (root == null) {
            return null;
        }
        if (root.val < l) {
            return solve(root.right, l, r);
        }
        if (root.val > r) {
            return solve(root.left, l, r);
        }
        root.left = solve(root.left, l, r);
        root.right = solve(root.right, l, r);
        return root;
    }
}