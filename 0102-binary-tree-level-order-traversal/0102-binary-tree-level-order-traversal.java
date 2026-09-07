class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        int level = 0;
        while (true) {
            List<Integer> curr = new ArrayList<>();
            kthLevel(root, 0, level, curr);
            if (curr.size() == 0) break;
            ans.add(curr);
            level++;
        }
        return ans;
    }
    private void kthLevel(TreeNode root, int level, int k, List<Integer> curr) {
        if (root == null) return;
        if (level == k) {
            curr.add(root.val);
            return;
        }
        kthLevel(root.left, level + 1, k, curr);
        kthLevel(root.right, level + 1, k, curr);
    }
}