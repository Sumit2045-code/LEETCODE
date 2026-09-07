class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()!=0){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=1;i<=size;i++){
                TreeNode data=q.remove();
                list.add(data.val);
                if(data.left!=null) q.add(data.left);
                if(data.right!=null) q.add(data.right);
            }
            ans.add(list);
        }
        return ans;
    }
}