class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        int n=nums.size();
        vector<int> ans1;
        vector<int>ans2;
        for(int i= 0;i<n;i++){
            ans1.push_back(nums[i]);
        }
        for(int i=0;i<n;i++){
            ans2.push_back(ans1[nums[i]]);
        }
        return ans2;
    }
};