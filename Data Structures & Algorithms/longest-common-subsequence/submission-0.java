class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=-1;
            }
        }
        return dfs(text1,text2,0,0,m,n);
    }
    public int dfs(String text1,String text2,int i,int j,int m,int n)
    {
        if(i == n ||j == m)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j))
        {
            dp[i][j]=1+dfs(text1,text2,i+1,j+1,m,n);
        }
        else
        {
            dp[i][j]=Math.max(dfs(text1,text2,i+1,j,m,n),dfs(text1,text2,i,j+1,m,n));
        }
        return dp[i][j];
    }
}
