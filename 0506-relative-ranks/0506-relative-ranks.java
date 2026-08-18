class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> score[b] - score[a]);
        for (int i = 0; i < n; i++) {
            int index = indices[i];
            if (i == 0) {
                ans[index] = "Gold Medal";
            } 
            else if (i == 1) {
                ans[index] = "Silver Medal";
            } 
            else if (i == 2) {
                ans[index] = "Bronze Medal";
            } 
            else {
                ans[index] = String.valueOf(i + 1);
            }
        }
        return ans;
    }
}