class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] height = new int[col];
        int maxArea = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1')
                    height[j]++;
                else
                    height[j] = 0;
            }
            maxArea = Math.max(maxArea, largestRectangle(height));
        }
        return maxArea;
    }
    public int largestRectangle(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            while (!st.isEmpty() &&
                  (i == heights.length || heights[st.peek()] >= heights[i])) {
                int height = heights[st.pop()];
                int width;
                if (st.isEmpty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}