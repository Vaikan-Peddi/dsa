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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }
    public void dfs(TreeNode node, int level, List<Integer> ans){
        if(node==null)return;
        if(ans.size()==level)ans.add(node.val);
        else {ans.set(level, Math.max(ans.get(level), node.val));}
        dfs(node.left, level+1, ans);
        dfs(node.right, level+1, ans);
    }
}
