class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len == 1)
        {
            return nums[0];
        }
        return Math.max(calc(nums,0,len-2),calc(nums,1,len-1));
    }
    public int calc(int[] num,int start,int end)
    {
        int n=end-start+1;
        int[] dp=new int[n+1];
        if(n == 1)
        {
            return num[start];
        }
        dp[0]=num[start];
        dp[1]=Math.max(num[start+1],num[start]);
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+num[start+i]);
        }
        return dp[n-1];

    }
}
