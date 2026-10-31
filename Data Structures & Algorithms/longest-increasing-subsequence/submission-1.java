class Solution {
    int[][] dp;
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int[n][n+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        return dfs(nums,0,-1);
    }
    public int dfs(int[] nums,int i,int j)
    {
        if(i==nums.length)
        {
            return 0;
        }
        if(dp[i][j+1]!=-1)
        {
            return dp[i][j+1];
        }
        int LIS=dfs(nums,i+1,j);
        if(j ==-1||nums[j]<nums[i])
        {
            LIS=Math.max(LIS,1+dfs(nums,i+1,i));
        }
        dp[i][j+1]=LIS;
        return LIS;
    }
}
