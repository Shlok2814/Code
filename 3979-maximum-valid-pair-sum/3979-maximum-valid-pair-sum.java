class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxLeft = Integer.MIN_VALUE;
        int answer = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            maxLeft = Math.max(maxLeft, nums[j - k]);
            answer = Math.max(answer, maxLeft + nums[j]);
        }
        return answer;
    }
}