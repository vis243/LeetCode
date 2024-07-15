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
     ArrayList<Integer> a=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
       inorder(root);
        return a;
        
        
    }
    
    
    public void inorder(TreeNode node){
        if(node==null)
            return;
        
        inorder(node.left);
        a.add(node.val);
        inorder(node.right);
    }
}