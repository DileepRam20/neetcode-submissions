class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> cset=new HashSet<>();
        int l=0;
        int res=0;
        for(int r=0;r<s.length();r++)
        {
            while(cset.contains(s.charAt(r)))
            {
                cset.remove(s.charAt(l));
                l++;
            }
            cset.add(s.charAt(r));
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
