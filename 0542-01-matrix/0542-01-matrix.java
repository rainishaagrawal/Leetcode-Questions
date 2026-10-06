class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int directions[][]={{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)queue.add(new int[]{i,j});
                else mat[i][j]=Integer.MAX_VALUE;
            }
        }
        while(!queue.isEmpty())
        {
            int cell[] = queue.poll();
            int row = cell[0];
            int col = cell[1];
            for(int direction[] : directions)
            {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && mat[newRow][newCol] > mat[row][col]+1)
                {
                    mat[newRow][newCol]=mat[row][col]+1;
                    queue.add(new int[]{newRow,newCol});
                }
            } 
        }
        return mat;
    }
}