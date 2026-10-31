class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] vis=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge :edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int res=0;
        for(int node=0;node<n;node++)
        {
            if(!vis[node])
            {
                dfs(adj,vis,node);
                res++;
            }
        }
        return res;
    }
    public void dfs(List<List<Integer>> adj,boolean[] vis,int node)
    {
        vis[node]=true;
        for(int nei : adj.get(node))
        {
            if(!vis[nei])
            {
                dfs(adj,vis,nei);
            }
        }
    }
}
