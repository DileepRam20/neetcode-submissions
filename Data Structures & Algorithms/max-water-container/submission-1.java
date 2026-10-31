class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length;
        int max_h=-1;
        int index=0;
        int ans=0;
        int res=0;
        int front=0;
        int end=len-1;
        while(front<end)
        {
            max_h=Math.min(heights[front],heights[end]);
            index=end-front;
            ans=index*max_h;
            res=Math.max(res,ans);
            if(heights[front]<heights[end])
            {
                front++;
            }
            else
            {
                end--;
            }
            
            
        }
        return res;
    }
}
