class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 1;
        long r = (long) Arrays.stream(time).min().getAsInt() * totalTrips;
        while (l < r) {
            long mid = l + (r - l) / 2;
            long total = 0;
            for (int t : time) {
                total += mid / t;
                if (total >= totalTrips) break;
            }
            if (total >= totalTrips) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}