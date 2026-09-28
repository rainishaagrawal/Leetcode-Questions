class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        queue.add(root);
        pos.add(0);
        int front = 0;
        int maxWidth = 0;
        while (front < queue.size()) {
            int levelSize = queue.size() - front;
            int first = pos.get(front);
            int last = pos.get(front + levelSize - 1);
            maxWidth = Math.max(maxWidth, last - first + 1);
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.get(front);
                int index = pos.get(front);
                front++;
                if (node.left != null) {
                    queue.add(node.left);
                    pos.add(2 * index + 1);
                }
                if (node.right != null) {
                    queue.add(node.right);
                    pos.add(2 * index + 2);
                }
            }
        }
        return maxWidth;
    }
}