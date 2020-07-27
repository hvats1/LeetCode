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
    
    private boolean validSubtree(TreeNode root,TreeNode upper, TreeNode lower)
    {
        if(root==null)
            return true;
        
        if(upper!=null && root.val>=upper.val) return false;
        if(lower!=null && root.val<=lower.val) return false;
        
        if(!validSubtree(root.left,root,lower)) return false;
        if(!validSubtree(root.right,upper,root)) return false;
        
        return true;   
    }
    
    public boolean isValidBST(TreeNode root) {
        
        if(root==null)
            return true;
        
        return validSubtree(root,null,null);
        
    }
}
