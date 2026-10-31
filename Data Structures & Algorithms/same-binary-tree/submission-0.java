/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(p);
        s2.push(q);
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            TreeNode temp1=s1.pop();
            TreeNode temp2=s2.pop();
            
            if(temp1 == null && temp2 == null)
            {
                continue;
            }
            if(temp1 == null || temp2 == null)
            {
                return false;
            }
            if(temp1.val!=temp2.val)
            {
                return false;
            }
            s1.push(temp1.left);
            s2.push(temp2.left);

            s1.push(temp1.right);
            s2.push(temp2.right);

            
        }
        return s1.isEmpty() &&s2.isEmpty();
    }
}
