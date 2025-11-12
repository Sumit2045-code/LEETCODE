class Solution {
public:

    int helper(int i,int j,vector<vector<int>> &t,vector<vector<int>>& dp){
        if(i==t.size()-1) return t[i][j];
        if (dp[i][j] != INT_MAX) return dp[i][j];
        int down= helper(i+1,j,t,dp);
        int left= helper(i+1,j-1,t,dp);
        int right= helper(i+1,j+1,t,dp);
        return dp[i][j]=t[i][j] + min({down,left,right});

    }
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int n=matrix.size();
        vector<vector<int>> dp(n,vector<int>(n,INT_MAX));
        return helper(0,0,matrix,dp);
    }
};