class Solution {
    static List<Integer> ans;
    public void dfs(TreeNode root){
        if(root==null) return;
        ans.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        dfs(root);
        return ans;
    }
}