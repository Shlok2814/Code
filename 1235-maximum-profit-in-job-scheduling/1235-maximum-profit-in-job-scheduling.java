import java.util.*;

class Solution {

    class Job {
        int start;
        int end;
        int profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;

        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(jobs, (a, b) -> Integer.compare(a.end, b.end));
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            Job current = jobs[i - 1];
            int low = 0;
            int high = i - 2;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (jobs[mid].end <= current.start) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            int previous = high;
            int skip = dp[i - 1];
            int take = current.profit + dp[previous + 1];

            dp[i] = Math.max(skip, take);
        }

        return dp[n];
    }
}