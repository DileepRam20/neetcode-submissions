class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1'&&!vis[i][j])
                {
                    counting(grid,i,j,vis,n,m);
                    count++;
                }
                
            }
        }
        return count;
    }
    public void counting(char[][] grid,int i,int j,boolean[][] vis,int n,int m)
    {
        vis[i][j]=true;
        int[] delrows={-1,1,0,0};
        int[] delcols={0,0,-1,1};
        for(int k=0;k<4;k++)
        {
            int newrow=i+delrows[k];
            int newcol=j+delcols[k];
            if(isValid(newrow,newcol,m,n)&& !vis[newrow][newcol]&&grid[newrow][newcol]=='1')
            {
                counting(grid,newrow,newcol,vis,n,m);
            }
        }
        
    }
    public boolean isValid(int i,int j,int m,int n)
    {
        if(i<0 || i>=n)
        {
            return false;
        }
        if(j<0 || j>=m)
        {
            return false;
        }
        return true;
    }
}
