class Solution {
public:

    int dfs(int i,int j,vector<vector<int>> &t,vector<vector<int>>& dp){
        if(i==t.size()-1) return t[i][j];
        if(dp[i][j]!=INT_MAX) return dp[i][j];
        int left=dfs(i+1,j,t,dp);
        int right=dfs(i+1,j+1,t,dp);
        return dp[i][j]=t[i][j] + min(left,right);
    }
    int minimumTotal(vector<vector<int>>& triangle) {
        int n= triangle.size();
        vector<vector<int>> dp(n,vector<int>(n,INT_MAX));
        return dfs(0,0,triangle,dp);
    }
};