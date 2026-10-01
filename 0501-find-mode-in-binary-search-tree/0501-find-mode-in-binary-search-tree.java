/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
              HashMap<Integer, Integer> mp = new HashMap<>();
        solve(root, mp);
        int max = 0;
        for (int value : mp.values()) {
            max = Math.max(max, value);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int key : mp.keySet()) {
            if (mp.get(key) == max) {
                ans.add(key);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
    public static void solve(TreeNode root, HashMap<Integer, Integer> mp) {
        if (root == null) return;
        solve(root.left, mp);
        mp.put(root.val, mp.getOrDefault(root.val, 0) + 1);
        solve(root.right, mp);
    }
}