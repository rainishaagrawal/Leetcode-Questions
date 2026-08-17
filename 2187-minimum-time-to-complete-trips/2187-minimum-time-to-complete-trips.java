class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long low = 1;
        long high = Long.MAX_VALUE;
        for (int i : time) {
            high = Math.min(high, (long) i * totalTrips);
        }
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long trips = 0;
            for (int i : time) {
                trips += mid / i;
            }
            if (trips >= totalTrips) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}