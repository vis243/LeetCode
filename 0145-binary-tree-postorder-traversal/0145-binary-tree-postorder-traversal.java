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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode p = root;
        while(p != null || !st.isEmpty()){
            if(p != null){
                ans.add(p.val);
                st.push(p);
                p = p.right;
            }
            else{
                p = st.pop();
                p = p.left;
            }
        }
        Collections.reverse(ans);
        return ans;
        
    }
}