class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int end=intervals[0][1];
        int n=intervals.length;
        int i=1;
        int count=0;
        while(i<n)
        {
            if(intervals[i][0]<end)
            {
                count++;
            }
            else
            {
                end=intervals[i][1];
            }
            i++;
        }
        return count;
    }
}
