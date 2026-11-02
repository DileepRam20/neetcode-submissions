class Solution {
    HashSet<Integer> vis=new HashSet<>();
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int[] pre :prerequisites)
        {
            map.get(pre[0]).add(pre[1]);
        }
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(i))
            {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int i)
    {
        if(vis.contains(i))
        {
            return false;
        }
        if(map.get(i).isEmpty())
        {
            return true;
        }
        vis.add(i);
        for(int nei : map.get(i))
        {
            if(!dfs(nei))
            {
                return false;
            }
        }
        vis.remove(i);
        map.put(i,new ArrayList<>());
        return true;

    }
    
}
