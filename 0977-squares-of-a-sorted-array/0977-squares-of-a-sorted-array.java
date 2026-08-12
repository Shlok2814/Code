class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]= new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                arr[i]=nums[l]*nums[l];
                l++;
            }
            else{
                arr[i]=nums[r]*nums[r];
                r--;
            }
        }
        return arr;
    }
}