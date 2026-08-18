class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int rad = 0;
        for (int i = 0; i < houses.length; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < heaters.length; j++) {
                int temp = Math.abs(houses[i] - heaters[j]);
                diff = Math.min(diff, temp);
            }
            rad = Math.max(rad, diff);
        }
        return rad;
    }
}