class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        int front = 0;
        boolean reverse = false;

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
            
            if (reverse) {
                Collections.reverse(level);
            }

            result.add(level);

            reverse = !reverse;
        }

        return result;
    }
}