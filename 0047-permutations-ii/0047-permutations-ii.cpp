class Solution {
public:
      
    void helper(vector<int> &nums,vector<bool> &visited,vector<vector<int>> &ans, vector<int> &curr){
     if (curr.size() == nums.size()) {
            ans.push_back(curr);
            return;
        }
       for (int i=0 ; i < nums.size(); i++) {
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && visited[i-1]!=true ) continue;

            visited[i] = true;
            curr.push_back(nums[i]);
            helper(nums, visited,ans,curr);
            curr.pop_back();
            visited[i] = false;
        }
    }

    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        vector<bool> visited(nums.size(), false);
        vector<int>curr;
        helper(nums, visited, ans,curr);
        return ans;
    }
};