class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        int front = 0;

        while (front < queue.size()) {
            int levelSize = queue.size() - front;
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.get(front++);
                level.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}