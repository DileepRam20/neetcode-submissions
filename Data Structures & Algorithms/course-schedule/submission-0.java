class Solution {
    Map<Integer,List<Integer>> map=new HashMap<>();
    Set<Integer> vis=new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int[]pre : prerequisites )
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
    public boolean dfs(int num)
    {
        if(vis.contains(num))
        {
            return false;
        }
        if(map.get(num).isEmpty())
        {
            return true;
        }
        vis.add(num);
        for(int n: map.get(num))
        {
            if(!dfs(n))
            {
                return false;
            }
        }
        vis.remove(num);
        map.put(num,new ArrayList<>());
        return true;
    }
}
