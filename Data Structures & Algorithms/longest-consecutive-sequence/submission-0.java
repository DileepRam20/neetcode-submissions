class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hset=new HashSet<>();
        for(int num : nums)
        {
            hset.add(num);
        }
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!hset.contains(nums[i]-1))
            {
                int curr=nums[i];
                int count=1;
                while(hset.contains(curr+1))
                {
                    count++;
                    curr++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
