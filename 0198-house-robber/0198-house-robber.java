class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];   // 0 to n-1
        Arrays.fill(dp,-1);  // mark
        return loot(0,nums);
    }
    private int loot(int i,int[] nums){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+loot(i+2,nums);
        int skip = loot(i+1,nums);
        return dp[i] = Math.max(pick,skip);
    }
}