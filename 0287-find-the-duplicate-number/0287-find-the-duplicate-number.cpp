class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int duplicate=-1;
    for(int i=0;i<nums.size();i++){
        int val =abs(nums[i]);
        if(nums[val]<0){
            duplicate=val;
            break;
        }
        nums[val]*=-1;
    }
    return duplicate;
    }
};