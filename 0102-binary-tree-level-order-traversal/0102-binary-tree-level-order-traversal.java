class Solution {
    class Pair {
        TreeNode node;
        int level;
        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root, 0));
        List<Integer> list = new ArrayList<>();
        while (q.size() > 0) {
            Pair front = q.remove();
            if (front.level != currLevel) {
                ans.add(list);
                list = new ArrayList<>();
                currLevel++;
            }
            list.add(front.node.val);
            if (front.node.left != null) {
                q.add(new Pair(front.node.left, front.level + 1));
            }
            if (front.node.right != null) {
                q.add(new Pair(front.node.right, front.level + 1));
            }
        }
        ans.add(list);
        return ans;
    }
}