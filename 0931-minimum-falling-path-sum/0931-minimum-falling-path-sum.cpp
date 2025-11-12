class Solution {
public:

    int helper(int i,int j,vector<vector<int>> &matrix,vector<vector<int>>& dp){
        int n=matrix.size();
        if (j < 0 || j >= matrix.size()) return 1e6;
        if(i==n-1) return matrix[i][j];
        if (dp[i][j] != INT_MIN) return dp[i][j];
        int down = helper(i+1,j,matrix,dp);
        int left = helper(i+1,j-1,matrix,dp);
        int right = helper(i+1,j+1,matrix,dp);
        return dp[i][j] = matrix[i][j] + min({down,left,right});

    }
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int n=matrix.size();
        vector<vector<int>> dp(n,vector<int>(n,INT_MIN));
        int ans = INT_MAX;
        
        for (int j = 0; j < n; j++) {
            ans = min(ans, helper(0, j, matrix, dp));
        }
        return ans;
    }
};