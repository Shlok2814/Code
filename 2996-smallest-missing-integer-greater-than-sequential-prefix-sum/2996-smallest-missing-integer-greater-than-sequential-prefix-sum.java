class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1; i<nums.length; i++){
             if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
             }
             else{
                break;
             }   
        }
        int x= sum;
        while(true){
        boolean found= false;
        for(int i=0;i<nums.length; i++){
            if(x==nums[i]){
                found= true;
                break;
            }
        }
        if(found){
            x++;
        } else{
            return x;
        }
    }
    }
}
