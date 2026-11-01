class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res= new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        res.add(intervals[0]);
        for(int[] inter : intervals)
        {
            int start=inter[0];
            int end=inter[1];
            int last=res.get(res.size()-1)[1];
            if(start<=last)
            {
                res.get(res.size()-1)[1]=Math.max(last,end);
            }
            else
            {
                res.add(new int[] {start,end});
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
