class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int cursum=0;
        for(int num : nums)
        {
            if(cursum < 0)
            {
                cursum=0;
            }
            cursum+=num;
            res=Math.max(res,cursum);
        }
        return res;
    }
}
