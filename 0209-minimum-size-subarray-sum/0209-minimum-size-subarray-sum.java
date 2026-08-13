class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int left=0;
     int currentsum=0;
     int minlen=nums.length+1;

     for(int right=0; right<nums.length; right++){
        currentsum+=nums[right];
        while(currentsum>=target){
            minlen=Math.min(minlen, right-left+1);
            currentsum-=nums[left];
            left++;
        }
     }
     if(minlen>nums.length){
        return 0;
     }
     return minlen;
    }
}