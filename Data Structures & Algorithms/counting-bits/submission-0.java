class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int res=0;
            for(int j=0;j<32;j++)
            {
                if((1<<j & i)!=0)
                {
                    res++;
                }
            }
            ans[i]=res;
        }
        return ans;
    }
}
