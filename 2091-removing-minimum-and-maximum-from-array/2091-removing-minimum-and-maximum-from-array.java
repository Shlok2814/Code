class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int n = nums.length;
        int bothFront = Math.max(minIndex, maxIndex) + 1;
        int bothBack = n - Math.min(minIndex, maxIndex);
        int oneEach = Math.min(minIndex, maxIndex) + 1
                    + n - Math.max(minIndex, maxIndex);

        return Math.min(bothFront, Math.min(bothBack, oneEach));
    }
}